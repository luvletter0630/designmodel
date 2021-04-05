package lwj.study.designmodel.ObserverPattern;

import org.omg.CORBA.Object;

/**
 * Created by Administrator on 2021/4/3.
 */
public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mTemperature: " + pressure + "***");
        System.out.println("***Today mTemperature: " + humidity + "***");
    }
}
