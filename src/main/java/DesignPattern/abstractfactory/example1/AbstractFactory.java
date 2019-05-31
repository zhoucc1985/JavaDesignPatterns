package DesignPattern.abstractfactory.example1;

/**
 * @ClassName: AbstractFactory
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:06
 * @Description: 抽象工厂创建一些列相关产品。定义创建两个相关或相互依赖的产品对象。
 */
public interface AbstractFactory {

    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}
