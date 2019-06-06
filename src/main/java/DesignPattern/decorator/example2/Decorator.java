package DesignPattern.decorator.example2;

/**
 * @ClassName: Decorator
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:56
 * @Description: 装饰器，需要跟被装饰的对象实现同样的接口
 */
public abstract class Decorator implements Component{

    /**
     * 持有被装饰的组件对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

}
