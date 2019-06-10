package DesignPattern.chainofresponsibility.example1;

/**
 * @ClassName: Handler
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:03
 * @Description: 职责的接口，也就是处理请求的接口
 */
public abstract class Handler {

    /**
     * 持有后继的职责对象。继承同一接口
     */
    protected Handler handler;

    /**
     * 设置后继的职责对象
     * @param handler 后继的职责对象
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数，
     * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();
}
