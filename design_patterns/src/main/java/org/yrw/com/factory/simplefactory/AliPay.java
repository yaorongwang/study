package org.yrw.com.factory.simplefactory;

public class AliPay implements IPay {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
