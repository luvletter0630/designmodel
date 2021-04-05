package lwj.study.designmodel.IteraptorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public class ComputCollegeIterator implements Iterator {
    Department[] departments;
    int position = 0;

    public ComputCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
