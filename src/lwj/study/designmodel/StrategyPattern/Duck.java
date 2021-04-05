package lwj.study.designmodel.StrategyPattern;

/**
 * Created by Administrator on 2021/4/4.
 */
public abstract class   Duck {
    QuackBehavior behavior;
    FlyBehavior flyBehavior;
    abstract void display();

    void fly() {
        flyBehavior.fly();
    }


    void quack() {
        behavior.quack();
    }


}
