package DesignPattern.abstractfactory.example1;

/**
 * @ClassName: ConcreteFactory1
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:02
 * @Description: 子工厂。实现创建2个具体有关联的产品A1和B1
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
