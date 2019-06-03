package DesignPattern.strategy;

/**
 * @ClassName: Strategy
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:16
 * @Description: 策略接口。用来约束一系列具体的策略算法。Context使用这个接口来调用集体的策略算法。每个算法之间都是独立平等，例如if-else中的算法，可以把公共算法放到抽象类中。
 */
public interface Strategy {

    /**
     * 某个算法的接口，可以有传入参数，也可以有返回值
     */
    public void algorithmInterface();
}
