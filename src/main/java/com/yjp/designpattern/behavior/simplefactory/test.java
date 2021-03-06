package com.yjp.designpattern.behavior.simplefactory;

public class test {
    /**
     * 定义：由一个工厂对象决定创建出哪一种类型实例。客户端只需传入工厂类的参数，无心关心创建过程。
     *
     * 优点：具体产品从客户端代码中抽离出来，解耦。
     *
     * 缺点：工厂类职责过重，增加新的类型时，得修改工程类得代码，违背开闭原则。
     * @param args
     */
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.produce("apple");
        fruit.eat();
    }
}
