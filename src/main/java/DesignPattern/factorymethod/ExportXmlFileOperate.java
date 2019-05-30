package DesignPattern.factorymethod;

/**
 * @ClassName: ExportXmlFileOperate
 * @Auther: zhoucc
 * @Date: 2019/5/30 12:47
 * @Description:
 */
public class ExportXmlFileOperate extends AbstractExportOperate {
    @Override
    protected  ExportFileApi factoryMethod() {
        return new ExportXmlFile();
    }
}
