package top.kwseeker.simpleFactory;

//披萨店
public class PizzaStore {

    public static void main(String[] args) {
        //下订单
        PizzaFactory pizzaFactory = new PizzaFactory();
        OrderPizza orderPizza = new OrderPizza(pizzaFactory);
    }
}
