package lwj.study.designmodel.IteraptorPatter;

import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> departments;
    private int position = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size() - 1) {
            return false;
        } else {
            position += 1;
            return true;
        }

    }

    @Override
    public Object next() {
        Department department = departments.get(position);
        return department;
    }

    @Override
    public void remove() {

    }
}
