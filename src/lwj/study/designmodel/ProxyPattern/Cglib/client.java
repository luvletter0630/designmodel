package lwj.study.designmodel.ProxyPattern.Cglib;


/**
 * Created by Administrator on 2021/4/2.
 */
public class client {


    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        Teacher teacher = (Teacher) proxyFactory.getProxyInstance();
        teacher.teach();
    }
}
