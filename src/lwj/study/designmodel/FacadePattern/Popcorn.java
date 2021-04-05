package lwj.study.designmodel.FacadePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public class Popcorn {
    private static Popcorn INSTACNE = new Popcorn();

    private Popcorn() {
    }

    public void on(){

    }

    public void off(){

    }

    public void play(){

    }

    public static Popcorn getInstance(){
        return INSTACNE;
    }

}
