package DesignPattern.strategy;

/**
 * @ClassName: ConcreteStrategyB
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:24
 * @Description: 实现封装的接口B算法
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("实现具体策略B算法或者else-if中算法");
    }
}
