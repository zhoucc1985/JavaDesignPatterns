package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: AbsractFactory
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:30
 * @Description: 装机工厂。创建配套的CPU和主板
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     */
    public CPUApi createCPUApi();

    /**
     * 创建内存对象
     */
    public MainboardApi createMainboardApi();
}
