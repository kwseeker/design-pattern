package top.kwseeker.pattern.strategy.pay.payport;

public enum PayType {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;
    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }
}
