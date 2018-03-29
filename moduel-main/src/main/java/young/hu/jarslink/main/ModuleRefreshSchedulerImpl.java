package young.hu.jarslink.main;

import com.alipay.jarslink.api.ModuleConfig;
import com.alipay.jarslink.api.impl.AbstractModuleRefreshScheduler;
import com.google.common.collect.ImmutableList;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ModuleRefreshSchedulerImpl extends AbstractModuleRefreshScheduler{
    //替换这个路径为你本地路径
    private static final String PATH = "/Users/huyong/Documents/git_work/baofoo/person/jarslink/";
    public static String VERSION = "1.0.0-SNAPSHOT";

    @Override
    public List<ModuleConfig> queryModuleConfigs() {
        return ImmutableList.of(buildServiceAModuleConfig(), buildServiceBModuleConfig());
    }

    private static ModuleConfig buildServiceAModuleConfig() {
        return buildModuleConfig(new String[]{PATH + "service-a/target/service-a-1.0.0-SNAPSHOT.jar", "service-a", VERSION});
    }

    private static ModuleConfig buildServiceBModuleConfig() {
        return buildModuleConfig(new String[]{PATH + "service-b/target/service-b-1.0.0-SNAPSHOT.jar", "service-b", VERSION});
    }

    private static ModuleConfig buildModuleConfig(String[] paras) {
        ModuleConfig moduleConfig = new ModuleConfig();
        try {
            URL demoModule = new URL("file", "", -1, paras[0]);
            moduleConfig.setName(paras[1]);
            moduleConfig.setEnabled(true);
            moduleConfig.setVersion(paras[2]);
            moduleConfig.setModuleUrl(ImmutableList.of(demoModule));
            return moduleConfig;
        } catch (MalformedURLException e) {

        }
        return moduleConfig;
    }
}
