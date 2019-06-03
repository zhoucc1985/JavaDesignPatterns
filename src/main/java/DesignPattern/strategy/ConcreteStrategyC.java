package DesignPattern.strategy;

/**
 * @ClassName: ConcreteStrategyC
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:25
 * @Description: 实现封装的接口C算法
 */
public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("实现具体策略C算法或者else中算法");
    }
}
