package lwj.study.designmodel.StrategyPattern;

/**
 * Created by Administrator on 2021/4/4.
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        flyBehavior = new NoflyBehavior();
        behavior = new NoQuackBehavior();
    }

    @Override
    void display() {
        System.out.println("玩具鸭");
    }


}
