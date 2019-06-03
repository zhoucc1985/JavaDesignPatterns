package DesignPattern.proxy;

/**
 * @ClassName: Proxy
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:56
 * @Description: 代理对象实现与真实对象的实现的接口。这样代理对象可以代替真实的对象。
 */
public class Proxy implements Subject {

    /**
     * 功能描述: 被代理的真实对象。
     *
     * @auther: zhoucc
     * @date: 2019/6/3 10:59
     */
    private Subject realSubject=null;

    /**
     * 构造方法，传入被代理的具体的目标对象。这样代理对象可以通过接口来实现真实的对象操作。
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("真实对象执行前");
        realSubject.request(); // 代理对象来实现真实对象的操作
        System.out.println("真实对象执行后");
    }

    public static void main(String[] args) {
        // 代理模式是通过创建一个与真实对象有相同接口的对象来代理真实对象。客户端操作代理对象最终还会有真实对象来完成。
        // 正因为有代理对象夹在客户端和真实对象中间，相当一个中转。中转可以有很多花招玩，如检验权限等。
        Subject proxySubject = new Proxy(new RealSubject());
        proxySubject.request();
    }
}
