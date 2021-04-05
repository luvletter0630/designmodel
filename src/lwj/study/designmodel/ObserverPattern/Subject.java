package lwj.study.designmodel.ObserverPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
}
