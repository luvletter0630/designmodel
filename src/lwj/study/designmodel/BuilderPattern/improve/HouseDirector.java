package lwj.study.designmodel.BuilderPattern.improve;

/**
 * Created by Administrator on 2021/3/31.
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入HouseBuilder
    public HouseDirector( HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    // setter方法传入HouseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
