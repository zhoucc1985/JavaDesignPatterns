package DesignPattern.factorymethod;

/**
 * @ClassName: ExportXmlFile
 * @Auther: zhoucc
 * @Date: 2019/5/30 11:42
 * @Description:
 */
public class ExportXmlFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        //简单示意一下，这里需要操作文件
        System.out.println("导出数据"+data+"到xml文件");
        return true;
    }
}
