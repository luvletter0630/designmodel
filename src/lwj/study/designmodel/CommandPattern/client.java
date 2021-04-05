package lwj.study.designmodel.CommandPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class client {

    public static void main(String[] args) {
        //创建点灯的对象
        LightReceiver lightReceiver = new LightReceiver();
        //创建点灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        //遥控器
        RemoteController remoteController = new RemoteController();
        //给遥控器设置命令，比如no=0是点灯的开和关的操作
        remoteController.setCommands(0,lightOnCommand,lightOffCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();
    }




}
