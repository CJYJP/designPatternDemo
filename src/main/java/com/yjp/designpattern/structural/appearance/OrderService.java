package com.yjp.designpattern.structural.appearance;

public class OrderService {
    public boolean placeAnOrder(Takeaway takeaway) {
        System.out.println(takeaway.getName() + "下单成功");
        return true;
    }
}
