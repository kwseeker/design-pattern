package top.kwseeker.pattern.strategy.pay.payport;

import top.kwseeker.pattern.strategy.pay.PayState;

public class WechatPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用微信支付");
        return new PayState(200, "支付成功", amount);
    }
}
