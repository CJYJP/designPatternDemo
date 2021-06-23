package com.yjp.designpattern.behavior.simplefactory;

public class test {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.produce("apple");
        fruit.eat();
    }
}
