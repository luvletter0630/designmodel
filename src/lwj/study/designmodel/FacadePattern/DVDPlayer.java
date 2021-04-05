package lwj.study.designmodel.FacadePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public class DVDPlayer {
    private static DVDPlayer INSTACNE = new DVDPlayer();

    private DVDPlayer() {
    }

    public void on(){

    }

    public void off(){

    }

    public void play(){

    }

    public static DVDPlayer getInstance(){
        return INSTACNE;
    }
}
