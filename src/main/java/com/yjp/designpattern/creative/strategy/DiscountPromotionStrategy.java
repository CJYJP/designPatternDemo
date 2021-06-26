package com.yjp.designpattern.creative.strategy;

public class DiscountPromotionStrategy implements PromotionStrategy{
    @Override
    public void promotion() {
        System.out.println("9.9折钜惠");
    }
}
