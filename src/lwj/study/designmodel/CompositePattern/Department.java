package lwj.study.designmodel.CompositePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Department extends  OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
