package young.hu.jarslink.main;

import com.alibaba.fastjson.JSON;
import com.alipay.jarslink.api.Module;
import com.alipay.jarslink.api.ModuleManager;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    private ModuleManager manager;

    @RequestMapping("/index")
    public String getServiceName() {
        return "this JarsLink service main module";
    }

    @RequestMapping("/info")
    public String getInfo() {
        return JSON.toJSONString(manager.getModules());
    }

    @RequestMapping(value = "/jarslink/{module}/{action}/{para}", method = RequestMethod.GET)
    public String getModule(@PathVariable String module, @PathVariable String action, @PathVariable String para) {
        Module moduleInstance = manager.find(module);
        Assert.assertNotNull(module);

        Object result = "";
        switch (action) {
            case "order":
                result = moduleInstance.doAction(action, Long.valueOf(para));
                break;
            case "user":
                result = moduleInstance.doAction(action, para);
                break;
            default:
                break;
        }
        return JSON.toJSONString(result);
    }
}
