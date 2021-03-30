package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式懒汉(线程安全) 双重验证 doublecheck
 */
public class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05(){}

    public static Singleton05 getInstance() {
        if (instance == null){
            synchronized (instance){
                if (instance == null){
                    return new Singleton05();
                }
            }

        }
        return instance;
    }
}
