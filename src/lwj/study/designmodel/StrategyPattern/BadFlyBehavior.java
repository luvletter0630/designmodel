package lwj.study.designmodel.StrategyPattern;

/**
 * Created by Administrator on 2021/4/4.
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("会飞飞的不好");
    }
}
