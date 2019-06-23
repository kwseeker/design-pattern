package top.kwseeker.abstractFactory;

import top.kwseeker.abstractFactory.factory.AbsFactory;
import top.kwseeker.abstractFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//披萨订单
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setPizzaFactory(absFactory);
    }

    public void setPizzaFactory(AbsFactory pizzaFactory) {
        Pizza pizza = null;
        String orderType;

        this.absFactory = pizzaFactory;

        do {
            orderType = getType();
            pizza = pizzaFactory.createPizza(orderType);
            if(pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = strIn.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
