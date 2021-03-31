package lwj.study.designmodel.BuilderPattern.improve;

/**
 * Created by Administrator on 2021/3/31.
 */
public class HighBuiding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBase("高楼地基");
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("高楼墙");
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼顶");
        System.out.println("高楼封顶");
    }
}
