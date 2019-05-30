package DesignPattern.factorymethod;


/**
 * @ClassName: ExportOperate
 * @Auther: zhoucc
 * @Date: 2019/5/30 11:32
 * @Description: 工厂方法
 */
public abstract class ExportOperate {

    /**
     * 功能描述: 数据导入。调用工厂方法，产生对象，执行对象操作。
     *
     * @param: 写入的数据
     * @auther: zhoucc
     * @date: 2019/5/30 12:49
     */
    public boolean export(String data){
        //调用工厂方法，获取对象。在子类中具体实现
        ExportFileApi api = factoryMethod();
        // 根据子类中具体产生的对象调用方法。
        return api.export(data);
    }

    /**
     * 功能描述: 工厂方法。抽象的方法，用于生产对象，使一个类的实例化延迟到其子类。
     *
     * @param:
     * @auther: zhoucc
     * @date: 2019/5/30 11:36
     */
    protected  abstract ExportFileApi factoryMethod();

}
