package lwj.study.designmodel.FactoryPattern.order;


import lwj.study.designmodel.FactoryPattern.Factory.SimpleFactory;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/31.
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
