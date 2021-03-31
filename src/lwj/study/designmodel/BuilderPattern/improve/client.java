package lwj.study.designmodel.BuilderPattern.improve;

/**
 * Created by Administrator on 2021/3/31.
 */
public class client {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector(new CommonHouse());
        House commonhouse = houseDirector.constructHouse();
        System.out.println(commonhouse.toString());

        HouseDirector highbuildingHouseDir = new HouseDirector(new HighBuiding());
        House highbuilding = highbuildingHouseDir.constructHouse();
        System.out.println(highbuilding.toString());
    }
}
