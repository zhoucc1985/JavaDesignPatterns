package DesignPattern.strategy;

/**
 * @ClassName: Context
 * @Auther: zhoucc
 * @Date: 2019/6/3 10:26
 * @Description: 策略的客户端。
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }

    public static void main(String[] args) {
        // 策略将一系列平等的算法（if-elif-else）独立封装成接口。如果算法中有相同部分，可以定义在虚类中
        Context context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
