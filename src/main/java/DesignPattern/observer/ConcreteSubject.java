package DesignPattern.observer;

/**
 * @ClassName: ConcreteObserver
 * @Auther: zhoucc
 * @Date: 2019/6/4 11:12
 * @Description: 具体的目标对象，负责把有关状态存入到相应的观察者对象.并在自己状态发生改变时，通知各个观察者.
 */
public class ConcreteSubject extends Subject {
    /**
     * 示意，目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return this.subjectState;
    }

    /**
     * 目标发生变化
     */
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
