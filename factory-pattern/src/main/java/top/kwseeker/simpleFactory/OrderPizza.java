package top.kwseeker.simpleFactory;

import top.kwseeker.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//披萨订单
public class OrderPizza {
    PizzaFactory pizzaFactory;

    public OrderPizza(PizzaFactory pizzaFactory) {
        setPizzaFactory(pizzaFactory);
    }

    public void setPizzaFactory(PizzaFactory pizzaFactory) {
        Pizza pizza = null;
        String orderType;

        this.pizzaFactory = pizzaFactory;

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
