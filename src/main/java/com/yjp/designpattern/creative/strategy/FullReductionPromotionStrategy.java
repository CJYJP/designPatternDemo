package com.yjp.designpattern.creative.strategy;

public class FullReductionPromotionStrategy implements PromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("满1000立减1");
    }
}
