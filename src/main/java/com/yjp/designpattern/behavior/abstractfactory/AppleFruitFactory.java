package com.yjp.designpattern.behavior.abstractfactory;

public class AppleFruitFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new AppleFruit();
    }

    @Override
    public Price getPrice() {
        return new ApplePrice();
    }
}
