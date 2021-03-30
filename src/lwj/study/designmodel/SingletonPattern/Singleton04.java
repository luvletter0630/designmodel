package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式懒汉(线程安全) 方法同步 锁粒度太大 效率低
 *
 */
public class Singleton04 {
    private static volatile Singleton04 instance;

    private Singleton04() {
    }

    public static synchronized Singleton04 getInstance() {
        if (instance == null) {
            return new Singleton04();
        }
        return instance;
    }
}
