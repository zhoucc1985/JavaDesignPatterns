package DesignPattern.composite.example1;

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
     * 功能描述: 存储子节点的组合对象
     *
     * @auther: zhoucc
     * @date: 2019/6/5 10:38
     */
    private List<Component> childComponents = null;

    /**
     * 功能描述: 与叶子节点不同的其他操作
     *
     * @auther: zhoucc
     * @date: 2019/6/5 10:39
     */
    @Override
    public void someOperate() {
        System.out.println("我是组合对象");
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
        if (children != null) {
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
