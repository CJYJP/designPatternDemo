package com.yjp.designpattern.structural.appearance;

public class PayService {
    public boolean pay(Takeaway takeaway) {
        System.out.println("商品" + takeaway.getName() + "支付成功");
        return true;
    }
}
