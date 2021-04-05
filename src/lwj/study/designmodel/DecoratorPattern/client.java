package lwj.study.designmodel.DecoratorPattern;

import lwj.study.designmodel.DecoratorPattern.mycoffe.LongBlack;
import lwj.study.designmodel.DecoratorPattern.mycoffe.ShorBlack;
import lwj.study.designmodel.DecoratorPattern.mydecorator.Chocolate;
import lwj.study.designmodel.DecoratorPattern.mydecorator.milk;

/**
 * Created by Administrator on 2021/4/2.
 */
public class client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Chocolate(order);
        order = new milk(order);
        System.out.println(order.cost());
        System.out.println(order.getDescription());
    }
}
