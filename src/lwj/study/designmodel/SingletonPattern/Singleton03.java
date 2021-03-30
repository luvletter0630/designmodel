package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式懒汉(线程不安全)
 */
public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03(){}

    public static Singleton03 getInstance() {
        if(instance == null){
            return new Singleton03();
        }
        return instance;
    }
}
