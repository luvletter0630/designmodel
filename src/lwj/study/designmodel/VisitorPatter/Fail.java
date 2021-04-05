package lwj.study.designmodel.VisitorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Fail extends Action {
    @Override
    public void getManresult() {
        System.out.println("Man评价失败");
    }

    @Override
    public void getWoManresult() {
        System.out.println("Woman评价失败");
    }
}
