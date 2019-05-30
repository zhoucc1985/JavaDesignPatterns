package DesignPattern.factorymethod;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/5/30 11:32
 * @Description: 测试工厂方法
 */
public class Client {

    public static void main(String[] args) {
        //创建需要使用具体工厂对象。
        AbstractExportOperate operate = new ExportXmlFileOperate();
        operate.export("测试数据");
    }
}
