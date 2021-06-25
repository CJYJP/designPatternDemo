package com.yjp.designpattern.structural.appearance;
/**
 * 外观模式又叫门面模式，提供了统一得接口，用来访问子系统中的一群接口。
 *
 * 适用于：
 *
 * 子系统越来越复杂，增加外观模式提供简单接口调用；
 * 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用。
 * 优点：
 *
 * 简化了调用过程，无需了解深入子系统；
 * 减低耦合度；
 * 更好的层次划分；
 * 符合迪米特法则。
 * 缺点：
 *
 * 增加子系统，拓展子系统行为容易引入风险；
 * 不符合开闭原则。
 */
public class test {
    public static void main(String[] args) {
        Takeaway takeaway = new Takeaway();
        takeaway.setName("泡椒🐸");

        TakeawayService takeawayService = new TakeawayService();
        takeawayService.takeOrder(takeaway);
    }
}
