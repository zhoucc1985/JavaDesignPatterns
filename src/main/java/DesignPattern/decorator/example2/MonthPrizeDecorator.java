package DesignPattern.decorator.example2;

import java.util.Date;

/**
 * @ClassName: MonthPrizeDecorator
 * @Auther: zhoucc
 * @Date: 2019/6/6 11:04
 * @Description:
 */
public class MonthPrizeDecorator extends Decorator {

    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //1：先获取前面运算出来的奖金
        double money = super.component.calcPrize(user, begin, end);
        //2：然后计算当月业务奖金,按照人员和时间去获取当月的业务额，然后再乘以3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user+"当月业务奖金"+prize);
        return money + prize;
    }
}
