package top.kwseeker.simpleFactory;

import top.kwseeker.simpleFactory.pizza.CheesePizza;
import top.kwseeker.simpleFactory.pizza.ChinesePizza;
import top.kwseeker.simpleFactory.pizza.GreekPizza;
import top.kwseeker.simpleFactory.pizza.Pizza;

//根据传入的订单类型作出不同的披萨
public class PizzaFactory {

    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)) {
            pizza = new CheesePizza();
        } else if("greek".equals(orderType)) {
            pizza = new GreekPizza();
        } else if("pepper".equals(orderType)) {
            pizza = new ChinesePizza();
        } else {

        }
        return pizza;
    }
}
