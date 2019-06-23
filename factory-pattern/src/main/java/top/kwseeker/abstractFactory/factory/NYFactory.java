package top.kwseeker.abstractFactory.factory;

import top.kwseeker.abstractFactory.pizza.*;

public class NYFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        if(orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if(orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;
    }
}
