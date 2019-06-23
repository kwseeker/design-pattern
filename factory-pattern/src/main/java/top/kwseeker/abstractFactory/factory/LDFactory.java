package top.kwseeker.abstractFactory.factory;

import top.kwseeker.abstractFactory.pizza.LDCheesePizza;
import top.kwseeker.abstractFactory.pizza.LDPepperPizza;
import top.kwseeker.abstractFactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
