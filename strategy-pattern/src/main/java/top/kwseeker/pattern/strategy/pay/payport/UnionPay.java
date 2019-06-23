package top.kwseeker.pattern.strategy.pay.payport;

import top.kwseeker.pattern.strategy.pay.PayState;

public class UnionPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用银联支付");
        return new PayState(200, "支付成功", amount);
    }
}
