package DesignPattern.prototype.example3;

/**
 * @ClassName: Product
 * @Auther: zhoucc
 * @Date: 2019/6/12 11:02
 * @Description: 产品对象
 */
public class Product implements Cloneable, OrderApi {

    /**
     * 产品编号
     */
    private String productId;
    /**
     * 产品名称
     */
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    @Override
    public String toString(){
        return "产品编号="+this.productId+"，产品名称="+this.name;
    }

    @Override
    public int getOrderProductNum() {
        return 0;
    }

    @Override
    public void setOrderProductNum(int num) {
    }

    @Override
    public OrderApi clone() {
        OrderApi orderApi = null;
        try {
            orderApi = (OrderApi) super.clone();
        } catch (Exception e){
            e.printStackTrace();
        }
        return orderApi;
    }
}
