package DesignPattern.prototype.example1;

/**
 * @ClassName: ConcretePrototype2
 * @Auther: zhoucc
 * @Date: 2019/6/12 10:35
 * @Description:
 */
public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        // 在原型对象上克隆一个新对象
        return new ConcretePrototype2();
    }
}
