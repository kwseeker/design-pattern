package top.kwseeker.abstractFactory.factory;

import top.kwseeker.abstractFactory.pizza.Pizza;

public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
