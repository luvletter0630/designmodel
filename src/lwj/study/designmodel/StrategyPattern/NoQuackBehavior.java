package lwj.study.designmodel.StrategyPattern;

/**
 * Created by Administrator on 2021/4/4.
 */
public class NoQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
