package DesignPattern.templatemethod;

/**
 * @ClassName: NormalLogin
 * @Auther: zhoucc
 * @Date: 2019/6/13 10:33
 * @Description: 默认登录方式。正常登录。
 */
public class NormalLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        // 这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPasswd("testpwd");
        return lm;
    }
}
