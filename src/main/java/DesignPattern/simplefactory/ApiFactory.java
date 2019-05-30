package DesignPattern.simplefactory;

/**
 * @ClassName: ApiFactory
 * @Auther: zhoucc
 * @Date: 2019/5/30 09:43
 * @Description: 简单工厂，根据条件创建产品。工厂命名最好就是模块名 + Factory
 */

public class ApiFactory {
    /**
     * 功能描述: 简单工厂提供一个公用的静态方法来获取产品
     *
     * @param: 需要创建产品的类型条件。客户端必须要知道条件类型对应的产品
     * @auther: zhoucc
     * @date: 2019/5/30 9:53
     */
    public static Api createApi(int type) {
        // 命名规则：create或get + 接口名
        Api api = null;
        if (type == 1) {
            api = new ImpApi1();
        } else if (type == 2) {
            api = new ImpApi2();
        }
        return api;
    }
}
