package lwj.study.designmodel.StrategyPattern;

/**
 * Created by Administrator on 2021/4/4.
 */
public class GeGeQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("GeGe叫");
    }
}
