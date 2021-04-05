package lwj.study.designmodel.CommandPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class LightOnCommand implements Command {
    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        System.out.println("开灯");
        lightReceiver.on();
    }

    @Override
    public void undo() {
        System.out.println("关灯");
        lightReceiver.off();
    }


}
