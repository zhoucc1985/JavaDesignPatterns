package DesignPattern.chainofresponsibility.example1;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/6/10 10:05
 * @Description: 职责链的客户端，这里只是个示意
 */
public class Client {

    public static void main(String[] args) {
        //先要组装职责链
        Handler h1 = new ConcreteHandle1();
        Handler h2 = new ConcreteHandle2();
        h1.setHandler(h2);
        //然后提交请求
        h1.handleRequest();
    }
}
