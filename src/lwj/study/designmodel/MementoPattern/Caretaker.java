package lwj.study.designmodel.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Caretaker {
    //在List集合中会有很多的备忘录对象
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
