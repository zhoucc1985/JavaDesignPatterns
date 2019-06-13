package DesignPattern.templatemethod;

/**
 * @ClassName: LoginTemplate
 * @Auther: zhoucc
 * @Date: 2019/6/13 10:19
 * @Description: 登录控制的模板
 * 抽象类：既要约束子类的行为，又要为子类提供公共功能。
 */
public abstract class LoginTemplate {

    /**
     * 判断登录数据是否正确。把相同部分拿出来定义一个方法，可以在子类中使用。
     * @param lm 登录模型
     * @return true 表示登录成功; false 表示登录失败
     */
    public final boolean login(LoginModel lm) {
        LoginModel dmLm = this.findLoginUser(lm.getLoginId());
        if (dmLm != null) {
            String encryptPwd = this.encryptPwd(lm.getPasswd());
            lm.setPasswd(encryptPwd);
            return this.match(lm, dmLm);
        }
        return false;
    }

    /**
     * 从数据库中根据登录id获取的登录对象。抽象方法，因为不同的登录方式获取的信息不同，例如不同的表。
     * @param loginId 登录id
     */
    public abstract LoginModel findLoginUser(String loginId);

    /**
     * 默认的加密方式，即不加密。
     * @param passwd
     * @return
     */
    public String encryptPwd(String passwd) {
        return passwd;
    }

    public boolean match(LoginModel lm,LoginModel dbLm){
        if (lm.getLoginId().equals(dbLm.getLoginId()) && lm.getPasswd().equals(dbLm.getPasswd())) {
            return true;
        }
        return false;
    }
}
