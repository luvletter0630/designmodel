package lwj.study.designmodel.IteraptorPatter;

/**
 * Created by Administrator on 2021/4/3.
 */
public interface College {
    String getName();

    void addDepaartment(String name,String desc);

    Iterator createrIterator();
}
