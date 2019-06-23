package top.kwseeker.pattern.strategy.pay;

import top.kwseeker.pattern.strategy.pay.payport.PayType;

/**
 * 订单
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    //支付方法
    public PayState pay(PayType payType) {
        //这里选择一种支付实现
        return payType.getPayment().pay(uid, amount);
    }
}
