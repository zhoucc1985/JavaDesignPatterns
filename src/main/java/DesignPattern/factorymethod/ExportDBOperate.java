package DesignPattern.factorymethod;

/**
 * @ClassName: ExportDBOperate
 * @Auther: zhoucc
 * @Date: 2019/5/30 12:48
 * @Description:
 */
public class ExportDBOperate extends AbstractExportOperate {
    @Override
    protected  ExportFileApi factoryMethod() {
        //创建导出成数据库备份文件形式的对象
        return new ExportDB();
    }
}
