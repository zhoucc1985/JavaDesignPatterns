package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: Schema1
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:38
 * @Description: 具体工厂。生产配套的Intel CPU和技嘉主板
 */
public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU();
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new GAMainboard();
    }
}
