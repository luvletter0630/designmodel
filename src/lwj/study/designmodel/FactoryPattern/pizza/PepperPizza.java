package lwj.study.designmodel.FactoryPattern.pizza;

/**
 * Created by Administrator on 2021/3/31.
 */
public class PepperPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepper Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pepper Pizza prepare");
    }

    @Override
    public void cut() {
        System.out.println("Pepper Pizza prepare");
    }

    @Override
    public void box() {
        System.out.println("Pepper Pizza prepare");
    }
}
