package DesignPattern.observer;

/**
 * @ClassName: Observer
 * @Auther: zhoucc
 * @Date: 2019/6/4 10:59
 * @Description: 观察者接口。提供目标更新时对应的更新方法，这个更新方法进行相应的业务处理，可以在这个方法里面回调目标对象，以获取目标对象的数据。
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，好获取相应的目标对象的状态
     */
    public void update(Subject subject);
}
