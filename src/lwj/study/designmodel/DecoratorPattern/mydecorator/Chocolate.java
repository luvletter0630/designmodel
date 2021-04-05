package lwj.study.designmodel.DecoratorPattern.mydecorator;

import lwj.study.designmodel.DecoratorPattern.Drink;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Chocolate extends Decorator{
    private float Price = 2.5f;

    public Chocolate(Drink drink) {
        super(drink);
        setDescription("巧克力");
        setPrice(Price);
    }
}
