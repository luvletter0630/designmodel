package lwj.study.designmodel.IteraptorPatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class InfoCollege implements College {
    private List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepaartment("信息安全","信息安全专业");
        addDepaartment("网络安全","网络安全专业");
        addDepaartment("服务器安全","服务器安全专业");
        addDepaartment("数据安全","数据安全专业");
        addDepaartment("通信安全","通信安全专业");
    }

    @Override
    public String getName() {
        return "信息技术安全学院";
    }

    @Override
    public void addDepaartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments.add(department);
    }

    @Override
    public Iterator createrIterator() {
        return new InfoCollegeIterator(departments);
    }
}
