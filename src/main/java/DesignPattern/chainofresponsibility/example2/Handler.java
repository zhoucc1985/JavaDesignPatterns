package DesignPattern.chainofresponsibility.example2;

/**
 * @ClassName: Handler
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:15
 * @Description: 定义职责对象的接口
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected Handler handler;

    /**
     * 设置下一个处理请求的对象
     * @param handler 下一个处理请求的对象
     */
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 处理聚餐费用的申请
     * @param user 申请人
     * @param fee 申请的钱数
     * @return 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user,double fee);
}
