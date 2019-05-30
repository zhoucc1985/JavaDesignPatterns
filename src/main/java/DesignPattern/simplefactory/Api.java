package DesignPattern.simplefactory;

/**
 * @ClassName: Api
 * @Auther: zhoucc
 * @Date: 2019/5/30 09:44
 * @Description:
 */
public interface Api {
    /**
     * 功能描述: 针对接口编程，实现封装和隔离。接口用来定义实现类的外观，相当一份契约，根据外部应用需要的功能，约定了实现类应该要实现的功能。
     *           只要接口不变，内部实现的变化就不会影响到外部应用，从而使得系统更灵活，具有更好的扩展性和可维护性
     *
     * @auther: zhoucc
     * @date: 2019/5/30 10:02
     */
    void test();
}
