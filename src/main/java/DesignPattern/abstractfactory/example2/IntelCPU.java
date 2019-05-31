package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: IntelCPU
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:40
 * @Description: 具体Intel产品CPU
 */
public class IntelCPU implements CPUApi {
    @Override
    public void calculate() {
        System.out.println("Intel 处理器");
    }
}
