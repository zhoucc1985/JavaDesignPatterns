package DesignPattern.Singleton;

/**
 * @ClassName: Singleton
 * @Auther: zhoucc
 * @Date: 2019/5/29 10:35
 * @Description: 单例设计模式。确保一个类只有一个实例，并提供一个唯一的访问接口。
 */

/**
 * 双重加锁检查的懒汉式单例
 */
public class Singleton {

    /**
     * 定义一个变量来存储创建好的类实例,静态变量（全局访问方法能够获取），volatile 确保对象构造按照一定顺序执行
     */
    private static volatile Singleton uniqueInstance;

    /**
     * 私有的构造函数，外部不能直接创建对象，保证了只能通过唯一接口访问。
     */
    private Singleton(){}

    /**
     * 唯一公共获取单例接口
     * @return 唯一单例实例对象
     */
    public static Singleton getUniqueInstance(){
        // 进入时检查单例对象存在，如果存在则返回已存在的单例对象，不存在则创建
        if (uniqueInstance == null) {
            // 加锁，防止多线程同时进入，保证多线程下对象唯一
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * 在语句uniqueInstance = new Singleton()中并不是一个原子操作，在JVM中其实是3个操作：
     * 1.给uniqueInstance分配空间、
     * 2.调用Singleton的构造函数来初始化、
     * 3.将uniqueInstance对象指向分配的内存空间（uniqueInstance指向分配的内存空间后就不为null了）；
     *   在JVM中的及时编译存在指令重排序的优化，也就是说不能保证1,2,3执行的顺序，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是 1-3-2，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时uniqueInstance已经是非 null 了（但却没有初始化），所以线程二会直接返回uniqueInstance，然后使用，然后顺理成章地报错。
     *   通过添加volatile就可以解决这种报错，因为volatile可以保证1、2、3的执行顺序，没执行玩1、2就肯定不会执行3，也就是没有执行完1、2instance一直为空
     */
}
