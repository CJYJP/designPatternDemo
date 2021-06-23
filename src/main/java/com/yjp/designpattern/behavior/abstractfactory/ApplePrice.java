package com.yjp.designpattern.behavior.abstractfactory;

public class ApplePrice extends Price{

    @Override
    public void pay() {
        System.out.println("🍎单价2元");
    }
}
