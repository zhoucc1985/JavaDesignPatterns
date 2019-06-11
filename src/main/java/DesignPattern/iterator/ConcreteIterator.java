package DesignPattern.iterator;

/**
 * @ClassName: ConcreteIterator
 * @Auther: zhoucc
 * @Date: 2019/6/11 10:24
 * @Description: 具体的迭代器实现
 */
public class ConcreteIterator implements Iterator {

    /**
     * 持有被迭代的具体的聚合对象
     */
    private Aggregate concretAggregate;

    /**
     * 内部索引，记录当前迭代到的索引位置。
     * -1表示刚开始的时候，迭代器指向聚合对象第一个对象之前
     */
    private int index = -1;

    /**
     * 构造方法，传入被迭代的具体的聚合对象
     * @param concretAggregate 被迭代的具体的聚合对象
     */
    public ConcreteIterator(Aggregate concretAggregate) {
        this.concretAggregate = concretAggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < this.concretAggregate.size()){
            index = index + 1;
        }
    }

    @Override
    public boolean hasNext() {
        if(index == this.concretAggregate.size() && concretAggregate != null){
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.concretAggregate.getIndex(index);
    }
}
