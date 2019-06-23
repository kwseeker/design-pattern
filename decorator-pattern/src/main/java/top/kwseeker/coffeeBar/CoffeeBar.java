package top.kwseeker.coffeeBar;

import top.kwseeker.coffeeBar.coffee.LongBlack;
import top.kwseeker.coffeeBar.decorator.Chocolate;
import top.kwseeker.coffeeBar.decorator.Milk;

public class CoffeeBar {

    public static void main(String[] args) {
        Drink order = new LongBlack();
        System.out.println("Order desc: " + order.getDescription() + " price: " + order.cost());

        Drink order1 = new Chocolate(new Chocolate(new Milk(new LongBlack())));
        System.out.println("Order1 desc: " + order1.getDescription() + " price: " + order1.cost());
    }
}
