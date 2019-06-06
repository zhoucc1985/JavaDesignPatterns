package DesignPattern.decorator.example1;

/**
 * @ClassName: ConcreteDecorator
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:35
 * @Description: 具体实现装饰器对象A
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * 因为装饰器与被装饰对象都来自同一接口，所以也可以装饰装饰器。递归装饰
     * @param component 被装饰的对象
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 接口装饰
     */
    @Override
    public void doSomeOperate() {
        System.out.println("我是装饰器对象A，现在给被装饰器装饰接口");
        super.component.doSomeOperate();
        System.out.println("我是装饰器对象A，现在已经完成被装饰器装饰接口");
    }
}
