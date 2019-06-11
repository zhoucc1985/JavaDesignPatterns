package DesignPattern.iterator;

/**
 * @ClassName: Iterator
 * @Auther: zhoucc
 * @Date: 2019/6/11 10:21
 * @Description: 迭代器接口
 */
public interface Iterator {

    /**
     * 访问索引移动到聚合对象的第一个位置
     */
    public void first();

    /**
     * 访问索引移动到聚合对象的下一个位置
     */
    public void next();

    /**
     * 判断当前访问索引是否已经移动聚合对象的最后一个位置
     * @return true 已经移到聚合对象的最后一个位置
     */
    public boolean hasNext();

    /**
     * 获取当前访问索引所在位置的对象
     */
    public Object currentItem();
}
