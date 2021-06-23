package com.yjp.designpattern.behavior.factoryapproach;

import com.yjp.designpattern.behavior.simplefactory.Apple;
import com.yjp.designpattern.behavior.simplefactory.Fruit;

public class AppleFruitFactory extends FruitFactory{

    @Override
    public Fruit produceFruit() {
        return new Apple();
    }
}
