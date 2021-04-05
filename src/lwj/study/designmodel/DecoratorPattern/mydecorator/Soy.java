package lwj.study.designmodel.DecoratorPattern.mydecorator;

import lwj.study.designmodel.DecoratorPattern.Drink;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Soy extends Decorator {
    private float Price = 2.0f;

    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(Price);
    }
}
