package com.yjp.designpattern.structural.bridging;

public class JackStore extends Store{
    public JackStore(Pie pie) {
        super(pie);
    }

    @Override
    Pie makePie() {
        System.out.print("杰克的小店💒");
        return pie.makePie();
    }
}
