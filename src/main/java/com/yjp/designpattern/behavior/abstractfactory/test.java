package com.yjp.designpattern.behavior.abstractfactory;

public class test {
    /**
     * 抽象工厂模式（Abstract factory pattern）提供了一系列相关或者相互依赖的对象的接口，关键字是“一系列”。
     *
     * 优点：具体产品从客户端代码中抽离出来，解耦。
     *      将一个系列的产品族统一到一起创建。
     *
     * 缺点：拓展新的功能困难，需要修改抽象工厂的接口；
     * @param args
     */
    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        factory.getFruit().buy();
        factory.getPrice().pay();
    }
}
