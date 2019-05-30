package DesignPattern.simplefactory;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/5/30 09:43
 * @Description: 客户端简单工厂调用
 */
public class Client {

    public static void main(String[] args) {
        ApiFactory.createApi(1);
    }
}
