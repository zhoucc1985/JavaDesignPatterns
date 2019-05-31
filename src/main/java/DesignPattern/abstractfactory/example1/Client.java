package DesignPattern.abstractfactory.example1;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:00
 * @Description: 客户端不知产品创建具体实现，只调用接口，实现解耦。
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ConcreteFactory2();
        AbstractProductA productA = abstractFactory.createProductA();
        AbstractProductB productB = abstractFactory.createProductB();
        productA.testA();
        productB.testB();
    }
}
