package DesignPattern.adapter;

/**
 * @ClassName: Adaptee
 * @Auther: zhoucc
 * @Date: 2019/6/4 10:18
 * @Description: 真实工作对象。通过适配器将被适配对象进行转换，供目标接口使用。已经存在的接口，这个接口需要被适配。
 */
public class Adaptee {

    public void specificRequest() {
        //具体的功能处理
        System.out.println("真实工作对象");
    }
}
