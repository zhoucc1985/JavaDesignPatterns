package DesignPattern.iterator;

/**
 * @ClassName: Aggregate
 * @Auther: zhoucc
 * @Date: 2019/6/11 10:21
 * @Description: 聚合对象接口
 */
public interface Aggregate {

    /**
     * 聚合对象创建迭代器接口
     */
    public Iterator createIterator();

    /**
     * 聚合对象元素的个数
     * @return
     */
    public int size();

    /**
     * 获取聚合对象索引处的元素
     * @param index 访问索引
     */
    public Object getIndex(int index);
}
