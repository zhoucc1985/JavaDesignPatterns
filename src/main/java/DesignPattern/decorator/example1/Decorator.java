package DesignPattern.decorator.example1;

/**
 * @ClassName: Decorator
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:29
 * @Description: 装饰器。需要与被装饰对象实现同一接口，以便能够递归装饰和使用同一接口递归调用
 */
public abstract class  Decorator implements Component {
    /**
     * 被装饰对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
