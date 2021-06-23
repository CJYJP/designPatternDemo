package com.yjp.designpattern.behavior.simplefactory;

public class FruitFactory {

    public Fruit produce(String name) {
        if ("apple".equals(name)) {
            return new Apple();
        } else {
            return null;
        }
    }
}
