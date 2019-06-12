package DesignPattern.prototype.example3;

/**
 * @ClassName: PersonalOrder
 * @Auther: zhoucc
 * @Date: 2019/6/12 11:01
 * @Description:
 */
public class PersonalOrder implements OrderApi, Cloneable {

    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品对象
     */
    private Product product = null;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public OrderApi clone() {
        OrderApi order = null;
        try {
            order = (OrderApi) super.clone();
            ((PersonalOrder) order).setProduct((Product) product.clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
}
