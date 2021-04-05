package lwj.study.designmodel.ProxyPattern.StaticProxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class client {
    public static void main(String[] args) {
        ITeacher proxyteach = new TeacherProxy(new Teacher());
        proxyteach.teach();
    }
}
