package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式饿汉静态代码块
 */
public class Singleton02 {
    private static Singleton02 instance;

    static {
        instance = new Singleton02();
    }
    private Singleton02(){}

    public Singleton02 getInstance(){
        return instance;
    }
}
