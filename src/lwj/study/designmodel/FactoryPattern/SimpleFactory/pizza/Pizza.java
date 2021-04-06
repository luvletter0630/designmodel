package lwj.study.designmodel.FactoryPattern.SimpleFactory.pizza;

/**
 * Created by Administrator on 2021/3/30.
 */
public interface Pizza {
    public void prepare();

    public void bake();

    public void cut();

    public void box();
}
