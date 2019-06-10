package DesignPattern.builder;

/**
 * @ClassName: KFCWaiter
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:38
 * @Description: Driver。构造者，将一个复杂的对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class KFCWaiter {

    /**
     * 构件产品的具体构建者。不同的构建者构建不同的产品
     */
    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    /**
     * 根据构建者构建产品。将对象创建和表现分离
     */
    public Meal construct(){
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
