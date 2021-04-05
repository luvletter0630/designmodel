package lwj.study.designmodel.IteraptorPatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2021/4/3.
 */
public class Client {
    public static void main(String[] args) {
        List<College> arrayList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        arrayList.add(computerCollege);
        arrayList.add(infoCollege);

        OutputImpl output = new OutputImpl(arrayList);
        output.printCollege();
    }
}
