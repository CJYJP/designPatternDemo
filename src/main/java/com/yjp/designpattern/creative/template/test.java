package com.yjp.designpattern.creative.template;

/**
 * 模板方法模式
 * 模板方法模式定义了一个流程的骨架，由多个方法组成。并允许子类为一个或多个步骤提供实现。简而言之就是公共的不变的部分由父类统一实现，变化的部分由子类来个性化实现。
 *
 * 优点：
 *
 * 提高复用性；
 * 提高拓展性；
 * 符合开闭原则。
 * 缺点：
 *
 * 类的数目增加；
 * 增加了系统实现的复杂度；
 * 父类添加新的抽象方法，所有子类都要改一遍。
 */
public class test {
    public static void main(String[] args) {
        Takeaway barbecue = new BarbecueTakeaway(true);
        barbecue.flow();

        FruitTakeaway fruit = new FruitTakeaway();
        fruit.flow();
    }
}
