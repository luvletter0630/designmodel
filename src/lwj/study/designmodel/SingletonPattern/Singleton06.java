package lwj.study.designmodel.SingletonPattern;

/**
 * Created by Administrator on 2021/3/30.
 * 单例模式静态内部类
 */
public class Singleton06 {
    private Singleton06() {

    }

    private static class SingletonInstance {
        private static final Singleton06 instance = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return SingletonInstance.instance;
    }

}
