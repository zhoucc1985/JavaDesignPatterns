package DesignPattern.factorymethod;

/**
 * @ClassName: ExportTxtFileOperate
 * @Auther: zhoucc
 * @Date: 2019/5/30 12:45
 * @Description:
 */
public class ExportTxtFileOperate extends AbstractExportOperate {
    @Override
    protected  ExportFileApi factoryMethod() {
        //创建导出成文本文件格式的对象
        return new ExportTxtFile();
    }
}
