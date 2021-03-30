package lwj.study.designmodel.FactoryPattern.order;

import lwj.study.designmodel.FactoryPattern.pizza.GreekPizza;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/31.
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.sellPizza(new GreekPizza());
    }
}
