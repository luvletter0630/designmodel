package lwj.study.designmodel.FactoryPattern.SimpleFactory.pizza;

/**
 * Created by Administrator on 2021/3/30.
 */
public class ChessPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Chess Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chess Pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chess Pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chess Pizza box");
    }
}
