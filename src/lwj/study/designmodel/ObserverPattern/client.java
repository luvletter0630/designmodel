package lwj.study.designmodel.ObserverPattern;

/**
 * Created by Administrator on 2021/4/3.
 */
public class client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditions = new CurrentConditions();
        Observer baidu = new baidu();

        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(baidu);

        System.out.println("通知各个注册观察者，看看信息");
        weatherData.setData(20.f,11.0f,23.5f);
    }
}
