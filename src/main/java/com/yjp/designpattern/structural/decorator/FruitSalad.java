package com.yjp.designpattern.structural.decorator;

public class FruitSalad extends AbstractFruitSalad{
    @Override
    public String remark() {
        return "水果🥗（标准）\n";
    }

    @Override
    public int price() {
        return 9;
    }
}
