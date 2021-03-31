package lwj.study.designmodel.BuilderPattern.improve;

/**
 * Created by Administrator on 2021/3/31.
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBase("普通地基");
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通墙");
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通顶");
        System.out.println("普通房子封顶");
    }
}
