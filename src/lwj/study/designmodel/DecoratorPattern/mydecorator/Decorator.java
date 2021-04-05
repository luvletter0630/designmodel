package lwj.study.designmodel.DecoratorPattern.mydecorator;

import lwj.study.designmodel.DecoratorPattern.Drink;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
       return  drink.getDescription() + "&&" + description;
    }
}
