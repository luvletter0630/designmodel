package lwj.study.designmodel.AdapterPattern;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int Output5v() {
        int srcV = getVoltage();
        int dstV = srcV / 44;
        return dstV;
    }
}
