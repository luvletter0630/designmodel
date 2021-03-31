package lwj.study.designmodel.PrototypePattern;

import java.io.*;

/**
 * Created by Administrator on 2021/3/31.
 * 原型模式深拷贝两种方式
 */
public class DeepProtoType implements Cloneable, Serializable {
    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    @Override
    protected Object clone() {
        DeepProtoType obj = null;
        try {
            obj = (DeepProtoType) super.clone();
            obj.setDeepCloneableTarget((DeepCloneableTarget) deepCloneableTarget.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    //序列化克隆
    public DeepProtoType deepclone() {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        DeepProtoType deepProtoType = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepProtoType = (DeepProtoType) ois.readObject();
            return deepProtoType;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (bos != null)
                try {
                    if (bos != null)
                        bos.close();
                    if (oos != null)
                        oos.close();
                    if (bis != null)
                        bis.close();
                    if (ois != null)
                        ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return deepProtoType;
    }
}