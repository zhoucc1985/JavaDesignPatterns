package DesignPattern.observer;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/4 10:58
 * @Description: 客户端。观察者模式本质就是触发联动
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        // 注册
        subject.addObserver(observer);
        // 通知变化
        ((ConcreteSubject) subject).setSubjectState("OK");
    }
}
