package DesignPattern.prototype.example3;

/**
 * @ClassName: OrderApi
 * @Auther: zhoucc
 * @Date: 2019/6/12 10:58
 * @Description: 订单的接口
 */
public interface OrderApi {

    /**
     * 获取订单产品数量
     * @return 订单中产品数量
     */
    public int getOrderProductNum();
    /**
     * 设置订单产品数量
     * @param num 订单产品数量
     */
    public void setOrderProductNum(int num);

    public OrderApi clone();
}
