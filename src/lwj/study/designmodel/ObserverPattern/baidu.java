package lwj.study.designmodel.ObserverPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class baidu implements Observer{
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
        System.out.println("***百度 气温: " + temperature + "***");
        System.out.println("***百度 气压: " + pressure + "***");
        System.out.println("***百度 湿度: " + humidity + "***");
    }
}
