package lwj.study.designmodel.DecoratorPattern.mycoffe;


/**
 * Created by Administrator on 2021/4/2.
 */
public class LongBlack extends Coffe {

    public LongBlack() {
        setDescription("黑咖啡");
        setPrice(10.0f);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
