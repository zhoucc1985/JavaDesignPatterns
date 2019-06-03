package DesignPattern.proxy;

/**
 * @ClassName: RealSubject
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:55
 * @Description: 真实对象
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实对象操作");
    }
}
