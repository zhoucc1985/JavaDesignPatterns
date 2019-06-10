package DesignPattern.builder;

/**
 * @ClassName: MealBuilder
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:37
 * @Description: 抽象构造者接口。定义创建一个产品对象所需的各个部件的操作。
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return this.meal;
    }
}
