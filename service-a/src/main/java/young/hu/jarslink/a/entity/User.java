package young.hu.jarslink.a.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import young.hu.jarslink.a.enums.Gender;

@Getter
@Setter
@ToString
@Accessors(chain = true)
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号
     */
    private String mobile;
}
