package com.yjp.designpattern.structural.bridging;

public class ApplePie implements Pie{
    @Override
    public Pie makePie() {
        System.out.println("制作苹果派🍎🥧");
        return new ApplePie();
    }

    @Override
    public void getType() {
        System.out.println("水果派");
    }
}
