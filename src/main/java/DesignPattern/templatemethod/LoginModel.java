package DesignPattern.templatemethod;

/**
 * @ClassName: LoginModel
 * @Auther: zhoucc
 * @Date: 2019/6/13 10:17
 * @Description: 登录模型
 */
public class LoginModel {

    private String loginId;

    private String passwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
