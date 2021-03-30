package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式饿汉静态常量
 */
public class Singleton01 {
    private static Singleton01 instance = new Singleton01();

    private Singleton01(){}

    public static Singleton01 getInstance() {
        return instance;
    }
}
