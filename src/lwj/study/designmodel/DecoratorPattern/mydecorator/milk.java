package lwj.study.designmodel.DecoratorPattern.mydecorator;

import lwj.study.designmodel.DecoratorPattern.Drink;

/**
 * Created by Administrator on 2021/4/2.
 */
public class milk extends Decorator{
    private float Price = 2.0f;

    public milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(Price);
    }
}
