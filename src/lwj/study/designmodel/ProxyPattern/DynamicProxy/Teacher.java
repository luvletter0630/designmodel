package lwj.study.designmodel.ProxyPattern.DynamicProxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("教学");
    }

    @Override
    public void sayhello(String str) {
        System.out.println(str);
    }
}
