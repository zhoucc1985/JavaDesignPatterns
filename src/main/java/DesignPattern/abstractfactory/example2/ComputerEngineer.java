package DesignPattern.abstractfactory.example2;


/**
 * @ClassName: ComputerEngineer
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:24
 * @Description: 工程师装电脑
 */
public class ComputerEngineer {

    /**
     * 定义组装机器需要的CPU
     */
    private CPUApi cpu;

    /**
     * 定义组装机器需要的主板
     */
    private MainboardApi mainboard;

    /**
     * 装机过程
     * @param schema 客户选择的装机方案
     */
    public void makeComputer(AbstractFactory schema){
        prepareHardwares(schema);
    }

    public void prepareHardwares(AbstractFactory schema) {
        this.cpu = schema.createCPUApi();
        this.mainboard = schema.createMainboardApi();
        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}
