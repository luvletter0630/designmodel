package lwj.study.designmodel.MediatorPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
