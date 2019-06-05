package DesignPattern.composite.example2;

import DesignPattern.composite.example2.Component;

/**
 * @ClassName: Leaf
 * @Auther: zhoucc
 * @Date: 2019/6/5 10:35
 * @Description: 叶子对象。没有子对象，所以没有添加，删除和获取子节点功能实现，只需要默认抛出即可。
 */
public class Leaf extends Component {

    /**
     * 叶子节点名称
     */
    private String name = null;

    public Leaf(String name) {
        this.name = name;
    }

    /**
     * 功能描述: 叶子节点不同的操作
     *
     * @auther: zhoucc
     * @date: 2019/6/5 10:36
     */
    @Override
    public void someOperate() {
        System.out.println("我是" + this.name + "叶子节点。");
    }
}
