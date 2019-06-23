package top.kwseeker.coffeeBar.decorator;

import top.kwseeker.coffeeBar.Drink;

public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDescription("Milk");
        super.setPrice(2.0f);
    }
}
