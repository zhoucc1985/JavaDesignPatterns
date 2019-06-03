package DesignPattern.strategy;

/**
 * @ClassName: ConcreteStrategyA
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:22
 * @Description: 实现封装的接口A算法。
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("实现具体策略A算法或者if中算法");
    }
}
