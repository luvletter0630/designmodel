package lwj.study.designmodel.ProxyPattern.DynamicProxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        ITeacher proxyInstance = (ITeacher) proxyFactory.getProxyInstance();
        proxyInstance.teach();
        proxyInstance.sayhello("say hello");
    }
}
