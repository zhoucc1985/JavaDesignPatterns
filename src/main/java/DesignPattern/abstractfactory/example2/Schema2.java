package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: Schema2
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:48
 * @Description: 具体工厂。生产配对AMD处理器和微星主板
 */
public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU();
    }

    @Override
    public MainboardApi createMainboardApi() {
        return new MSIMainboard();
    }
}
