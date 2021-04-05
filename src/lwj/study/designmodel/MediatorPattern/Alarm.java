package lwj.study.designmodel.MediatorPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Alarm extends Colleague{


    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name,this);
    }

    public void SendAlarm(int statChange){
        SendMessage(statChange);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
