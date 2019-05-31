package DesignPattern.abstractfactory.example1;

/**
 * @ClassName: ConcreteFactory2
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:03
 * @Description: 子工厂。实现创建2个具体有关联的产品A2和B2
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
