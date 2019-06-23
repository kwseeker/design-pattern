package top.kwseeker.coffeeBar.decorator;

import top.kwseeker.coffeeBar.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        super.setDescription("Chocolate");
        super.setPrice(3.0f);
    }
}
