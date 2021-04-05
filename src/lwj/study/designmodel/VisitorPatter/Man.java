package lwj.study.designmodel.VisitorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Man extends Person {
    @Override
    void accept(Action action) {
        action.getManresult();
    }
}
