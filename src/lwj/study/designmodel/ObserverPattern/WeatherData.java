package lwj.study.designmodel.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observerList;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(this.getTemperature(), this.getPressure(), this.getHumidity());
        }
    }
}
