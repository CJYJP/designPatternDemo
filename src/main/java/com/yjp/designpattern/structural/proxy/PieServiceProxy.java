package com.yjp.designpattern.structural.proxy;

public class PieServiceProxy {
    private PieServcie pieServcie;

    public void makePie() {
        beforeMethod();
        pieServcie = new PieServiceImpl();
        pieServcie.makePie();
        afterMethod();
    }

    private void beforeMethod() {
        System.out.println("准备材料");
    }

    private void afterMethod() {
        System.out.println("保鲜");
    }
}
