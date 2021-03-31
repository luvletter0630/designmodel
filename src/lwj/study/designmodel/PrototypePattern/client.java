package lwj.study.designmodel.PrototypePattern;

/**
 * Created by Administrator on 2021/3/31.
 * 原型模式
 * 如果原型模式内有成员变量是对象，该对象会浅拷贝
 * 深拷贝实现方式
 * 1.重写clone方法
 * 2.使用反序列化clone对象
 */
public class client {
    public static void main(String[] args) {
        Sheep prototype = new Sheep("tom", 1, "white");
        prototype.setFriend(new Sheep("jack", 2, "black"));
        System.out.println(prototype.toString());
        Sheep sheep = (Sheep) prototype.clone();
        Sheep sheep1 = (Sheep) prototype.clone();
        Sheep sheep2 = (Sheep) prototype.clone();
        sheep2.setAge(11);
        Sheep sheep3 = (Sheep) prototype.clone();
        Sheep sheep4 = (Sheep) prototype.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());
        System.out.println(sheep2.toString());
        System.out.println(sheep3.toString());
        System.out.println(sheep4.toString());
    }
}
