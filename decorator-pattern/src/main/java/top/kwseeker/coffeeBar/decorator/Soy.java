package top.kwseeker.coffeeBar.decorator;

import top.kwseeker.coffeeBar.Drink;

public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        super.setDescription("Soy");
        super.setPrice(4.0f);
    }
}
