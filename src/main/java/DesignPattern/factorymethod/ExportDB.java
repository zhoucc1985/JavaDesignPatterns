package DesignPattern.factorymethod;

/**
 * @ClassName: ExportDB
 * @Auther: zhoucc
 * @Date: 2019/5/30 11:43
 * @Description:
 */
public class ExportDB implements ExportFileApi{
    @Override
    public boolean export(String data) {
        //简单示意一下，这里需要操作数据库和文件
        System.out.println("导出数据"+data+"到数据库备份文件");
        return true;
    }
}
