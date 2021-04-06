package lwj.study.designmodel.AdapterPattern.objectadapter;

import lwj.study.designmodel.AdapterPattern.IVoltage5V;
import lwj.study.designmodel.AdapterPattern.Voltage220V;

/**
 * 对象采集器模式
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int Output5v() {
        if (null != voltage220V){
            int srcV = voltage220V.getVoltage();
            int desV = srcV /44;
            return desV;
        }
        return 0;

    }
}
