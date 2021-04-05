package lwj.study.designmodel.DecoratorPattern;

/**
 * Created by Administrator on 2021/4/2.
 */
public abstract class Drink {
    public String description;
    private float price = 0.0f;

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
