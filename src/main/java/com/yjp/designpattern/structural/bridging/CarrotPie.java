package com.yjp.designpattern.structural.bridging;

public class CarrotPie implements Pie{
    @Override
    public Pie makePie() {
        System.out.println("制作胡萝卜派🥕🥧");
        return new CarrotPie();
    }

    @Override
    public void getType() {
        System.out.println("蔬菜沙拉派");
    }
}
