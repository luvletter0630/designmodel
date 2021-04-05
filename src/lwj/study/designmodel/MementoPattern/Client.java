package lwj.study.designmodel.MementoPattern;


/**
 * Created by Administrator on 2021/4/3.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1");
        caretaker.add(originator.savStateMemento());

        originator.setState("状态2");
        caretaker.add(originator.savStateMemento());

        originator.setState("状态3");
        caretaker.add(originator.savStateMemento());

        System.out.println("当前状态" + originator.getState());

        originator.getMemento(caretaker.get(0));
        System.out.println("恢复后状态"+ originator.getState());

    }
}
