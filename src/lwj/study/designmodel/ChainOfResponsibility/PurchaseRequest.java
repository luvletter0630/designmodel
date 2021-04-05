package lwj.study.designmodel.ChainOfResponsibility;

/**
 * Created by Administrator on 2021/4/4.
 */
public class PurchaseRequest {
    private int type;
    private int num;
    private float price = 0;
    private int id;

    public PurchaseRequest(int type, int num, float price) {
        this.type = type;
        this.num = num;
        this.price = price;
        this.id = (int) (100 * Math.random());
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
