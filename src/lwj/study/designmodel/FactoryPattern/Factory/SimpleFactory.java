package lwj.study.designmodel.FactoryPattern.Factory;

import lwj.study.designmodel.FactoryPattern.pizza.ChessPizza;
import lwj.study.designmodel.FactoryPattern.pizza.GreekPizza;
import lwj.study.designmodel.FactoryPattern.pizza.PepperPizza;
import lwj.study.designmodel.FactoryPattern.pizza.Pizza;

import java.util.Calendar;

/**
 * Created by Administrator on 2021/3/31.
 */
public class SimpleFactory {

    public Pizza createrPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new ChessPizza();
        } else if (type.equals("peper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }
}
