package lwj.study.designmodel.MementoPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
