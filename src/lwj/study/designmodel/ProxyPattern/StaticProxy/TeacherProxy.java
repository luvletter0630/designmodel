package lwj.study.designmodel.ProxyPattern.StaticProxy;

/**
 * Created by Administrator on 2021/4/2.
 */
public class TeacherProxy implements ITeacher{
    private Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("调用teach接口前");
        teacher.teach();
        System.out.println("调用teach接口后");
    }
}
