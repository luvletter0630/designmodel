package lwj.study.designmodel.VisitorPatter;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class ObjectStructure {
    private List<Person> personList = new LinkedList<Person>();

    public void attach(Person p){
        personList.add(p);
    }

    public void detach(Person p){
        personList.remove(p);
    }

    public void display(Action action){
        for (Person p : personList){
            p.accept(action);
        }
    }
}
