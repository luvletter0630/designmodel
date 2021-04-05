package lwj.study.designmodel.CommandPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class LightOffCommand implements Command {
    private LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        System.out.println("关灯");
        lightReceiver.off();
    }

    @Override
    public void undo() {
        System.out.println("取消关灯");
        lightReceiver.on();
    }
}
