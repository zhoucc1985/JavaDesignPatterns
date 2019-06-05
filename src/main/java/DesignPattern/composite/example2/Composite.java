package DesignPattern.composite.example2;

import DesignPattern.composite.example2.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Composite
 * @Auther: zhoucc
 * @Date: 2019/6/5 10:37
 * @Description: 组合对象。因为组合对象有添加，删除和获取子节点功能实现,所以要重新实现.
 */
public class Composite extends Component {

    /**
     * 组合对象名称
     */
    private String name = null;

    public Composite(String name) {
        this.name = name;
    }


    /**
     * 功能描述: 存储子节点的组合对象
     *
     * @auther: zhoucc
     * @date: 2019/6/5 10:38
     */
    private List<Component> childComponents = null;

    /**
     * 获取该节点所以子节点
     * @return
     */
    public List<Component> getChildren() {
        return childComponents;
    }

    /**
     * 功能描述: 与叶子节点不同的其他操作
     *
     * @auther: zhoucc
     * @date: 2019/6/5 10:39
     */
    @Override
    public void someOperate() {
        System.out.println("我是" + this.name + "组合对象");
        if (childComponents != null) {
            for (Component childComponent: childComponents) {
                childComponent.someOperate();
            }
        }
    }

    /**
     * 功能描述: 组合对象中添加子节点对象
     *
     * @param: 添加的子节点对象
     * @auther: zhoucc
     * @date: 2019/6/5 10:40
     */
    @Override
    public void addChildren(Component children) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        children.setParent(this);
        childComponents.add(children);
    }

    /**
     * 功能描述: 移除组合对象的子节点
     *
     * @param: 移除的子节点
     * @auther: zhoucc
     * @date: 2019/6/5 10:42
     */
    @Override
    public void removeChildren(Component children) {
        List<Component> componentList = null;
        int idx = childComponents.indexOf(children);
        if (children != null && idx > -1) {
            try {
                if ((componentList = children.getChildren()) != null) {
                    for (Component component: componentList) {
                        component.setParent(this);
                        this.addChildren(component);
                    }
                }
            } catch (UnsupportedOperationException err) {
                err.printStackTrace();
            }

            childComponents.remove(children);
        }
    }

    /**
     * 功能描述: 组合对象通过索引获取子对象
     *
     * @param: 索引
     * @auther: zhoucc
     * @date: 2019/6/5 10:47
     */
    @Override
    public Component getChildrenByIndex(int index) {
        if (childComponents != null && index > -1 && index < childComponents.size()) {
            return childComponents.get(index);
        }
        return null;
    }
}
