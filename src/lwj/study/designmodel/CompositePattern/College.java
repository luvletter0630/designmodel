package lwj.study.designmodel.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2021/4/2.
 */
public class College extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
    @Override
    protected void print() {
        System.out.println(getName());
        Iterator<OrganizationComponent> iterator = organizationComponents.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }
    }
}
