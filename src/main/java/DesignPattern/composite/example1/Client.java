package DesignPattern.composite.example1;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/5 10:19
 * @Description: 客户端。组合模式本质：统一叶子对象和组合对象。组合对象一般有两部分组成：叶子对象（无节点对象），子组合对象（有节点对象）
 */
public class Client {

    public static void main(String[] args) {
        // 根节点对象
        Component root = new Composite();
        Component composite = new Composite();
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        composite.addChildren(leaf1);
        composite.addChildren(leaf2);
        root.addChildren(composite);
        root.someOperate();
    }
}
