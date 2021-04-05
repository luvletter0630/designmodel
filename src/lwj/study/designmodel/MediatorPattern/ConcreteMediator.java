package lwj.study.designmodel.MediatorPattern;

import java.util.HashMap;

/**
 * Created by Administrator on 2021/4/3.
 */
public class ConcreteMediator extends Mediator {
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String,Colleague>();
        interMap = new HashMap<String,String>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);

        if (colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }else if(colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        }else if(colleague instanceof Curtains){
            interMap.put("Curtains", colleagueName);
        }else if(colleague instanceof TV){
            interMap.put("TV", colleagueName);
        }

    }

    //1.根据得到的消息完成任务
    //2.中介者在这个方法中
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                System.out.println("行为1");
            } else if (stateChange == 1) {
                System.out.println("行为2");
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            if (stateChange == 0) {
                System.out.println("行为1");
            } else if (stateChange == 1) {
                System.out.println("行为2");
            }
        }else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            if (stateChange == 0) {
                System.out.println("行为1");
            } else if (stateChange == 1) {
                System.out.println("行为2");
            }
        }else if (colleagueMap.get(colleagueName) instanceof TV){
            if (stateChange == 0) {
                System.out.println("行为1");
            } else if (stateChange == 1) {
                System.out.println("行为2");
            }
        }
    }

    @Override
    public void SendMessage() {

    }
}
