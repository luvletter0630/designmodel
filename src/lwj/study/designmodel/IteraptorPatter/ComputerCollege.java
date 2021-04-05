package lwj.study.designmodel.IteraptorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public class ComputerCollege implements College {
    private Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepaartment("java专业","java专业");
        addDepaartment("PHP专业","PHP专业");
        addDepaartment("大数据专业","大数据专业");
        addDepaartment("VUE专业","VUE专业");
        addDepaartment("python专业","python专业");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepaartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;

    }

    @Override
    public Iterator createrIterator() {
        return new ComputCollegeIterator(departments);
    }
}
