package top.kwseeker.coffeeBar.coffee;

import top.kwseeker.coffeeBar.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
