package lwj.study.designmodel.MediatorPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator,"Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"coffeMachine");
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tv = new TV(mediator,"tv");

        alarm.SendAlarm(1);
    }
}
