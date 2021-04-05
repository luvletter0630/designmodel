package lwj.study.designmodel.MediatorPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public abstract class Mediator {

    public abstract void Register(String s,Colleague colleague);

    public abstract void getMessage(int stateChange,String name);

    public abstract void SendMessage();

}
