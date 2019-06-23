package top.kwseeker.pattern.strategy.pay.payport;

import top.kwseeker.pattern.strategy.pay.PayState;

public class AliPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        return new PayState(200, "支付成功", amount);
    }
}
