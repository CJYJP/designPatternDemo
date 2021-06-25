package com.yjp.designpattern.structural.bridging;

/**
 * 桥接模式
 * 将抽象部分和具体实现部分分离，使它们都可以独立变化。通过组合的方式建立两个类之间的关系，而不是通过继承。
 *
 * 适用于：
 *
 * 抽象和实体实现之间增加更多的灵活性；
 * 一个类存在多个独立变化的维度，并且需要独立拓展；
 * 不希望使用继承。
 * 优点：
 *
 * 分离抽象部分和具体实现部分；
 * 提高了系统可拓展性；
 * 符合开闭原则和合成复用原则。
 * 缺点：
 *
 * 增加了系统的理解和设计难度；
 */
public class test {
    public static void main(String[] args) {
        Store samStore = new SamStore(new ApplePie());
        Pie samStorePie = samStore.makePie();
        samStorePie.getType();

        Store jackStore = new JackStore(new CarrotPie());
        Pie jackStorePie = jackStore.makePie();
        jackStorePie.getType();
    }
}
