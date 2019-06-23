package top.kwseeker.coffeeBar;

public abstract class Drink {

    //饮品描述
    public String description = "";
    //饮品价格
    private float price = 0f;

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
