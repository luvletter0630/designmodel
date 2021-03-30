package lwj.study.designmodel.FactoryPattern.order;

import lwj.study.designmodel.FactoryPattern.pizza.Pizza;

/**
 * Created by Administrator on 2021/3/30.
 */
public class OrderPizza {

    public void sellPizza(Pizza pizza){
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
