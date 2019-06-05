package DesignPattern.composite.example2;

import java.util.List;

/**
 * @ClassName: Component
 * @Auther: zhoucc
 * @Date: 2019/6/5 10:25
 * @Description: 抽象的组件对象。统一组合对象和叶子对象。
 */
public abstract class Component {

    /**
     * 记录组件的父对象
     */
    private Component parent = null;

    /**
     * 设置一个组件的父组件对象
     */
    public void setParent(Component parent) {
        this.parent = parent;
    }

    /**
     * 返回某个组件的子组件对象
     */
    public Component getParent() {
        // 缺省的实现，抛出例外
        throw new UnsupportedOperationException("对象不支持这个功能。因为叶子对象没有这个功能，或者子组件没有实现这个功能");
    }

    /**
     * 组件对象中组合对象与叶子对象不同的操作
     */
    public abstract void someOperate();

    /**
     * 组件对象中添加子对象。叶子对象或者子组件则抛出异常.
     * @param children 添加的子对象
     */
    public void addChildren(Component children){
        // 缺省的实现，抛出例外
        throw new UnsupportedOperationException("对象不支持这个功能。因为叶子对象没有这个功能，或者子组件没有实现这个功能");
    }

    /**
     * 组件对象中删除子对象。叶子对象或者子组件则抛出异常.
     * @param children 删除的子对象
     */
    public void removeChildren(Component children) {
        // 缺省的实现，抛出例外
        throw new UnsupportedOperationException("对象不支持这个功能。因为叶子对象没有这个功能，或者子组件没有实现这个功能");
    }

    /**
     * 组件对象中通过index索引获取子对象
     * @param index 索引
     * @return
     */
    public Component getChildrenByIndex(int index) {
        // 缺省的实现，抛出例外.
        throw new UnsupportedOperationException("对象不支持这个功能.因为叶子对象没有这个功能，或者子组件没有实现这个功能");
    }

    /**
     * 返回某个组件的子组件对象
     * @return 某个组件的子组件对象
     */
    public List<Component> getChildren() {
        // 缺省的实现，抛出例外.
        throw new UnsupportedOperationException("对象不支持这个功能.因为叶子对象没有这个功能，或者子组件没有实现这个功能");
    }
}
