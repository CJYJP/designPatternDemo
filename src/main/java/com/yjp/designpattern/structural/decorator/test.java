package com.yjp.designpattern.structural.decorator;

/**
 * 装饰者模式
 * 在不改变原有对象的基础之上，将功能附加到对象上，提供了比继承更有弹性的替代方案。
 *
 * 适用于：
 *
 * 拓展一个类的功能；
 * 动态给对象添加功能，并且动态撤销。
 * 优点：
 *
 * 继承的有力补充，不改变原有对象的情况下给对象拓展功能；
 * 通过使用不同的装饰类、不同的组合方式，实现不同的效果。
 * 符合开闭原则。
 * 缺点：
 *
 * 增加程序复杂性；
 */
public class test {
    public static void main(String[] args) {
        // 点了份水果沙拉，并加了两份🥝和一份🍉，看看最终价格是多少？
        AbstractFruitSalad fruitSalad = new FruitSalad();
        fruitSalad = new KiwiDecorator(fruitSalad);
        fruitSalad = new KiwiDecorator(fruitSalad);
        fruitSalad = new WaterMelonDecorator(fruitSalad);

        System.out.println(fruitSalad.remark() + "价格是：" + fruitSalad.price());
    }
}
