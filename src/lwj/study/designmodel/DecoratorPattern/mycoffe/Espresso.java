package lwj.study.designmodel.DecoratorPattern.mycoffe;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Espresso extends Coffe{
    public Espresso() {
        setDescription("意大利咖啡");
        setPrice(6.0f);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
