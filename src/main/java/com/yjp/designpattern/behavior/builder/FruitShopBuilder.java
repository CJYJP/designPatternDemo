package com.yjp.designpattern.behavior.builder;

public class FruitShopBuilder extends ShopBuilder{
    Shop shop=new Shop();
    @Override
    public void name(String name) {
        this.shop.setName(name);
    }

    @Override
    public void location(String location) {
        this.shop.setLocation(location);
    }

    @Override
    public void type(String type) {
        this.shop.setType(type);
    }

    @Override
    public Shop build() {
        return shop;
    }
}
