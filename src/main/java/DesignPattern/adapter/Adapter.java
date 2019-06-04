package DesignPattern.adapter;

/**
 * @ClassName: Adapter
 * @Auther: zhoucc
 * @Date: 2019/6/4 10:17
 * @Description: 适配器。通过适配器能够使目标接口使用。
 */
public class Adapter implements Target {

    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        //已经实现了的方法，进行适配转换
        adaptee.specificRequest();
    }
}
