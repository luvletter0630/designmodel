package lwj.study.designmodel.BuilderPattern;

/**
 * Created by Administrator on 2021/3/31.
 */
public class CommonHouse implements AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }

    @Override
    public void build() {
        this.buildBasic();
        this.buildWalls();
        this.roofed();
    }
}
