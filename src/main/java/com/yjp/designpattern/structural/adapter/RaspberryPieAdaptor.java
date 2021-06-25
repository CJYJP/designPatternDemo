package com.yjp.designpattern.structural.adapter;

public class RaspberryPieAdaptor extends Raspberry implements Pie{
    //对象适配器模式
    //private Raspberry raspberry = new Raspberry();
    @Override
    public void make() {
        System.out.println("制作一个派🥧");
        super.addRaspberry();
    }
}
