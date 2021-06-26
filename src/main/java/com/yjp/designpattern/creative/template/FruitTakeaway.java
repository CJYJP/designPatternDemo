package com.yjp.designpattern.creative.template;

public class FruitTakeaway extends Takeaway{
    @Override
    protected void make() {
        System.out.println("水果配货");
    }

    @Override
    protected boolean needTableware() {
        return false;
    }
}
