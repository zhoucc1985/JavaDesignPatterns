package DesignPattern.decorator.example2;

import java.util.Date;

/**
 * @ClassName: ConcreteComponent
 * @Auther: zhoucc
 * @Date: 2019/6/6 11:09
 * @Description:
 */
public class ConcreteComponent implements Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //只是一个默认的实现，默认没有奖金
        return 0;
    }
}
