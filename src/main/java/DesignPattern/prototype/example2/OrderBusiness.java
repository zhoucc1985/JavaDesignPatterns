package DesignPattern.prototype.example2;

/**
 * @ClassName: OrderBusiness
 * @Auther: zhoucc
 * @Date: 2019/6/12 10:49
 * @Description: 处理订单的业务对象
 */
public class OrderBusiness {

    public void saveOrder(OrderApi order){
        //根据业务要求，当订单的预定的产品数量超过1000的时候，就需要把订单拆成两份订单
        //当然如果要做好，这里的1000应该做成常量，这么做是为了演示简单

        //1：判断当前的预定产品数量是否大于1000
        //2：如果大于，还需要继续拆分
        //2.1再新建一份订单，跟传入的订单除了数量不一样外，其他都相同
        while(order.getOrderProductNum() > 1000){
            OrderApi newOrder = order.clone();
            newOrder.setOrderProductNum(1000);
            System.out.println("old order num=="+order.getOrderProductNum()+" , new Order num==="+newOrder.getOrderProductNum());
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("拆分生成订单=="+newOrder);
        }
        System.out.println("订单=="+order);
    }
}
