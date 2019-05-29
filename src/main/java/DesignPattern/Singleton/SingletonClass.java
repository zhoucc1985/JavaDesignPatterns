package DesignPattern.Singleton;

/**
 * @ClassName: SingletonClass
 * @Auther: zhoucc
 * @Date: 2019/5/29 10:58
 * @Description: 饿汉式单例
 */

/**
 * 饿汉式单例。虚拟机加载在类时，就创建实例。
 * 优点：线程安全，程序运行时已创建单例实例; 缺点：已空间换时间，如果只调用类的静态方法，就没必要创建实例了。
 */
public class SingletonClass {

    /**
     * 私有的构造函数，外部不能直接创建对象，保证了只能通过唯一接口访问。
     */
    private SingletonClass() {}

    /**
     * 静态对象实例，在类加载时创建实例
     */
    private static SingletonClass uniqueInstance = new SingletonClass();

    /**
     * 唯一公共获取单例接口
     * @return 唯一单例实例对象
     */
    public static SingletonClass getUniqueInstance() {
        return uniqueInstance;
    }
}
