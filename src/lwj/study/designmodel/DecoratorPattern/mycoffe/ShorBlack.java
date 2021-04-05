package lwj.study.designmodel.DecoratorPattern.mycoffe;

/**
 * Created by Administrator on 2021/4/2.
 */
public class ShorBlack extends Coffe {
    public ShorBlack() {
        setDescription("短咖啡");
        setPrice(8.0f);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
