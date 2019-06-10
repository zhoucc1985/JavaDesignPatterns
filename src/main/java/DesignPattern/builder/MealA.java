package DesignPattern.builder;

/**
 * @ClassName: ConcreteBuilder
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:38
 * @Description: 用户使用不同的具体建造者即可得到不同的产品对象 。
 */
public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
