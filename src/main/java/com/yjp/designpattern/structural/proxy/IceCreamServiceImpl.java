package com.yjp.designpattern.structural.proxy;

public class IceCreamServiceImpl implements IceCreamService{
    @Override
    public void makeIceCream(String fruit) {
        System.out.println("制作" + fruit + "🍦");
    }
}
