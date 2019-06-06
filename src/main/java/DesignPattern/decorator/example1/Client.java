package DesignPattern.decorator.example1;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:24
 * @Description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        // 被装饰的对象
        Component component = new ConcreteComponent();
        //用ConcreteDecoratorA装饰component对象
        Component componentA = new ConcreteDecoratorA(component);
        //用ConcreteDecoratorB装饰ConcreteDecoratorA对象
        Component componentB = new ConcreteDecoratorB(componentA);
        componentB.doSomeOperate();
    }
}
