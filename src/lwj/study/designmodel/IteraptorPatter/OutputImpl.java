package lwj.study.designmodel.IteraptorPatter;

import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class OutputImpl {
    private List<College> collegelist;

    public OutputImpl(List<College> college) {
        this.collegelist = college;
    }

    public void printCollege() {
        java.util.Iterator<College> iterator = collegelist.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("============"+college.getName()+"============");
            printDepartment(college.createrIterator());
        }
    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
