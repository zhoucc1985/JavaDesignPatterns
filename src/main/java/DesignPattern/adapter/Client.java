package DesignPattern.adapter;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/4 10:15
 * @Description: 客户端调用目标接口。由于某种原因，目标接口不能直接用，需要转换。
 */
public class Client {

    /**
     *  适配器模式本质：转换匹配，复用功能。
     */
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
