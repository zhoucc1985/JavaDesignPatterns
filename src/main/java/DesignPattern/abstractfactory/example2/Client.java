package DesignPattern.abstractfactory.example2;

/**
 * @ClassName: Client
 * @Auther: zhoucc
 * @Date: 2019/5/31 10:24
 * @Description: 客户端
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory absractFactory = new Schema2();
        ComputerEngineer computerEngineer = new ComputerEngineer();
        computerEngineer.prepareHardwares(absractFactory);
    }
}
