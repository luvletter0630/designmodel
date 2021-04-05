package lwj.study.designmodel.MementoPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象Memento
    //因此编写一个方法，返回Memento
    public Memento savStateMemento(){
        return new Memento(state);
    }

    public void getMemento(Memento memento){
        state = memento.getState();
    }
}
