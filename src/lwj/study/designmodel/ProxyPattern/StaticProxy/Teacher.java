package lwj.study.designmodel.ProxyPattern.StaticProxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Teacher implements ITeacher {
    @Override
    public void teach() {
        System.out.println("教学");
    }
}
