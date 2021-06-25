package com.yjp.designpattern.structural.bridging;

public abstract class Store {
    protected Pie pie;

    public Store(Pie pie){
        this.pie = pie;
    }

    abstract Pie makePie();
}
