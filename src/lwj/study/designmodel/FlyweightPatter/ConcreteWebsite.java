package lwj.study.designmodel.FlyweightPatter;

/**
 * Created by Administrator on 2021/4/2.
 */
public class ConcreteWebsite extends Website {
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    void use() {
        System.out.println("网站类型为" + type);
    }
}
