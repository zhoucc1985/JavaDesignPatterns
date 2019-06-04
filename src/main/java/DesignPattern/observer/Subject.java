package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Subject
 * @Auther: zhoucc
 * @Date: 2019/6/4 11:03
 * @Description: 目标对象。
 *  1，一个目标可以被多个观察者观察；
 *  2，目标提供对观察者注册和退订的维护；
 *  3，当目标状态发生变化时负责通知所有的注册、有效观察者更新。
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer 观察者对象
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者对象
     * @param observer 观察者对象
     */
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        for(Observer observer : observerList){
            observer.update(this);
        }
    }
}
