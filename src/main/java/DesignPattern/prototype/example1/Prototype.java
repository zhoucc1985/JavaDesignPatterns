package DesignPattern.prototype.example1;

/**
 * @ClassName: Prototype
 * @Auther: zhoucc
 * @Date: 2019/6/12 10:33
 * @Description: 声明一个克隆自身的接口
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Prototype clone();
}
