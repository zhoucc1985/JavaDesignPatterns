package DesignPattern.iterator;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/11 10:43
 * @Description: 关键思想就是把聚合对象中的遍历和访问从聚合对象中分离出来，放到迭代器中
 */
public class Client {

    public static void main(String[] args) {
        String[] names = {"张三","李四","王五"};
        //创建聚合对象
        Aggregate aggregate = new ConcretAggregate(names);
        //循环输出聚合对象中的值
        Iterator it = aggregate.createIterator();
        //首先设置迭代器到第一个元素
        it.first();
        while(!it.hasNext()){
            //取出当前的元素来
            Object obj = it.currentItem();
            System.out.println("the obj=="+obj);
            //如果还没有迭代到最后，那么就向下迭代一个
            it.next();
        }
    }
}
