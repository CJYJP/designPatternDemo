package com.yjp.designpattern.structural.decorator;

public class WaterMelonDecorator extends AbstractDecorator{
    public WaterMelonDecorator(AbstractFruitSalad fruitSalad) {
        super(fruitSalad);
    }
    @Override
    public String remark() {
        return super.remark() + "ๅ ไปฝ๐ๅ\n";
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
