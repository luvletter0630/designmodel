package lwj.study.designmodel.AdapterPattern;

public class Phone {

    public void charging(IVoltage5V voltage5V){
        if(voltage5V.Output5v()==5){
            System.out.println("可充电");
        }else if (voltage5V.Output5v() != 5){
            System.out.println("电压不符，不能充电");
        }
    }

    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.charging(new VoltageAdapter());
    }
}
