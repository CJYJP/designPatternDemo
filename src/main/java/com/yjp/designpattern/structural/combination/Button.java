package com.yjp.designpattern.structural.combination;

public class Button extends AbstractMenuButton{

    private String name;

    public Button(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "按钮";
    }

    @Override
    public void print() {
        System.out.println(getName() + "【" + getType() + "】");
    }
}
