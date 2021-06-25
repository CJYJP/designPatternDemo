package com.yjp.designpattern.structural.decorator;

public class KiwiDecorator extends AbstractDecorator{

    public KiwiDecorator(AbstractFruitSalad fruitSalad) {
        super(fruitSalad);
    }

    @Override
    public String remark() {
        return super.remark() + "加份🥝切\n";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
