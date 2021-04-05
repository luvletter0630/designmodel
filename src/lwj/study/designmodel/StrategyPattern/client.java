package lwj.study.designmodel.StrategyPattern;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2021/4/4.
 */
public class client {
    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.fly();
        toyDuck.quack();

        Integer[] array = {21, 31, 14, 15, 27, 28};
    }
}
