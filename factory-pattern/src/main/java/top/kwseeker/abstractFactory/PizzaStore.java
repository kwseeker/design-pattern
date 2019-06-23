package top.kwseeker.abstractFactory;

import top.kwseeker.abstractFactory.factory.LDFactory;

public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza orderPizza;
        orderPizza = new OrderPizza(new LDFactory());
    }
}
