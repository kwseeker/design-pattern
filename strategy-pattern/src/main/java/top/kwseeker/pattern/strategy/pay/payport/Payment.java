package top.kwseeker.pattern.strategy.pay.payport;

import top.kwseeker.pattern.strategy.pay.PayState;

public interface Payment {

    PayState pay(String uid, double amount);
}
