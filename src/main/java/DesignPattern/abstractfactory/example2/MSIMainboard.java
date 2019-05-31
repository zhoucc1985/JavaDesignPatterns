package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: MSIMainboard
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:44
 * @Description: 具体微星主板
 */
public class MSIMainboard implements MainboardApi {
    @Override
    public void installCPU() {
        System.out.println("微星主板，需要安装AMD处理器");
    }
}
