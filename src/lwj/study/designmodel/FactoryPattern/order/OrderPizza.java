package lwj.study.designmodel.FactoryPattern.order;

import lwj.study.designmodel.FactoryPattern.Factory.SimpleFactory;
import lwj.study.designmodel.FactoryPattern.pizza.Pizza;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/30.
 */
public class OrderPizza {
    private SimpleFactory factory;
    private String ordertype;
    private Pizza pizza;

    public OrderPizza(SimpleFactory factory) {
        this.factory = factory;
        SellPizza();
    }

    public void SellPizza() {
        do {
            getType();
            pizza = factory.createrPizza(ordertype);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
    }

    private void getType() {
        Scanner in = new Scanner(System.in);
        System.out.println("你想要哪种披萨：");
        this.ordertype = in.nextLine();
    }
}
