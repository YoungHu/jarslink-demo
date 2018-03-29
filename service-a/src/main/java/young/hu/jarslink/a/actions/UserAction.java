package young.hu.jarslink.a.actions;

import com.alipay.jarslink.api.Action;
import young.hu.jarslink.a.entity.User;
import young.hu.jarslink.a.enums.Gender;

/**
 * 获取用户信息Action
 *
 * @author huyong
 */
public class UserAction implements Action<String, User>{
    @Override
    public User execute(String userName) {
        return new User()
                .setName(userName)
                .setAge(22)
                .setEmail("abc@gmail.com")
                .setGender(Gender.FEMALE)
                .setGender(Gender.MALE)
                .setMobile("131XXXXXXXX");
    }

    @Override
    public String getActionName() {
        return "user";
    }
}
