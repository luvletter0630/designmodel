package lwj.study.designmodel.FacadePattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
    }

    public void read(){
        dvdPlayer.on();
        popcorn.on();
    }
}
