package DesignPattern.builder;

/**
 * @ClassName: Meal
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:37
 * @Description: 一个具体的产品对象
 */
public class Meal {

    private String food;
    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
