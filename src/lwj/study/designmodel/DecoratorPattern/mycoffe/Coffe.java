package lwj.study.designmodel.DecoratorPattern.mycoffe;

import lwj.study.designmodel.DecoratorPattern.Drink;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Coffe extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
