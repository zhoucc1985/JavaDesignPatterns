package DesignPattern.decorator.example1;

/**
 * @ClassName: ConcreteComponent
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:34
 * @Description: 被装饰对象
 */
public class ConcreteComponent implements Component {
    @Override
    public void doSomeOperate() {
        System.out.println("我是被装饰对象的接口");
    }
}
