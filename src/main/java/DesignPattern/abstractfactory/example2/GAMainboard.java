package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: GAMainboard
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:41
 * @Description: 具体主板。此主板必须安装IntelCPU，所以这两种产品有关联。
 */
public class GAMainboard implements MainboardApi {
    @Override
    public void installCPU() {
        System.out.println("技嘉主板，需要安装Intel 处理器");
    }
}
