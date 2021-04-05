package lwj.study.designmodel.TemplatePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public abstract class AbstractClass {
    protected void template(){
        operation2();
        operation3();
        operation4();
    }

    abstract void operation2();
    abstract void operation3();
    abstract void operation4();

}
