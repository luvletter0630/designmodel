package lwj.study.designmodel.CompositePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("四川大学", "985");

        OrganizationComponent college1 = new College("计算机学院", "计算机学院");
        OrganizationComponent college2 = new College("软件工程学院", "软件工程学院");

        OrganizationComponent department1 = new Department("计算进科学与技术", "计科");
        OrganizationComponent department2 = new Department("计算进工程", "计工");
        OrganizationComponent department3 = new Department("软件工程", "软工");
        OrganizationComponent department4 = new Department("信息安全", "信安");

        college1.add(department1);
        college1.add(department2);
        college2.add(department3);
        college2.add(department4);
        university.add(college1);
        university.add(college2);

        university.print();
    }
}
