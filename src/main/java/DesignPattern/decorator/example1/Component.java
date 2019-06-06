package DesignPattern.decorator.example1;

/**
 * @ClassName: Component
 * @Auther: zhoucc
 * @Date: 2019/6/6 10:27
 * @Description: 被装饰对象和装饰器的同一接口。以便装饰器能够递归装饰对象和递归调用被装饰的方法
 */
public interface Component {

    /**
     * 接口操作
     */
    public void doSomeOperate();
}
