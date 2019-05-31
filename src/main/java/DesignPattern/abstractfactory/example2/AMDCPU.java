package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: AMDCPU
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:43
 * @Description: 具体AMD处理器
 */
public class AMDCPU implements CPUApi {
    @Override
    public void calculate() {
        System.out.println("AMD 处理器");
    }
}
