package DesignPattern.iterator;

/**
 * @ClassName: ConcretAggregate
 * @Auther: zhoucc
 * @Date: 2019/6/11 10:40
 * @Description:
 */
public class ConcretAggregate implements Aggregate {

    private String[] ss = null;

    /**
     * 构造方法，传入聚合对象具体的内容
     * @param ss 聚合对象具体的内容
     */
    public ConcretAggregate(String[] ss){
        this.ss = ss;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int size() {
        return ss.length;
    }

    @Override
    public Object getIndex(int index) {
        Object retObj = null;
        if(index < ss.length){
            retObj = ss[index];
        }
        return retObj;
    }
}
