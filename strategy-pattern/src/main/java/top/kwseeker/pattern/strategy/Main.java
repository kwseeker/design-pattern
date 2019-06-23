package top.kwseeker.pattern.strategy;

import top.kwseeker.pattern.strategy.pay.Order;
import top.kwseeker.pattern.strategy.pay.payport.PayType;

public class Main {

    public static void main(String[] args) {
        Order order = new Order("1", "20190611001223", 2323.23);
        System.out.println(order.pay(PayType.ALI_PAY));
    }
}