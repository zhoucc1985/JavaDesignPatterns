package DesignPattern.prototype.example1;

/**
 * @ClassName: ConcretePrototype
 * @Auther: zhoucc
 * @Date: 2019/6/12 10:34
 * @Description:
 */
public class ConcretePrototype1 implements Prototype {

    /**
     * 在原生对上实现一个克隆自己的接口
     * @return
     */
    @Override
    public Prototype clone() {
        // 在原型对象上克隆一个新对象
        return new ConcretePrototype1();
    }
}
