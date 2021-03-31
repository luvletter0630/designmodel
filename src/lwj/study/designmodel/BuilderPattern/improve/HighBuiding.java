package lwj.study.designmodel.BuilderPattern.improve;

/**
 * Created by Administrator on 2021/3/31.
 */
public class HighBuiding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
