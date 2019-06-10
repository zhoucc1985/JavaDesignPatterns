package DesignPattern.builder;

/**
 * @ClassName: MealB
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:45
 * @Description:
 */
public class MealB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setFood("柠檬果汁");
    }
}
