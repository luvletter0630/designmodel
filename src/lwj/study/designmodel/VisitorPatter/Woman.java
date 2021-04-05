package lwj.study.designmodel.VisitorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWoManresult();
    }
}
