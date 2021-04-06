package lwj.study.designmodel.FactoryPattern.SimpleFactory.order;


import lwj.study.designmodel.FactoryPattern.SimpleFactory.Factory.SimpleFactory;

/**
 * Created by Administrator on 2021/3/31.
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new SimpleFactory());
    }
}
