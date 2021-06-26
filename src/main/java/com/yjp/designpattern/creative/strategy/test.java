package com.yjp.designpattern.creative.strategy;

/**
 * 策略模式
 * 策略模式定义了算法家族，分别封装起来，让它们之间可以互相替换。此模式让算法的变化不会影响到使用算法的用户。策略模式常用于消除大量的if else代码。
 *
 * 适用场景：
 *
 * 系统有很多类，它们的区别仅仅在于行为不同；
 * 一个系统需要动态地在几种算法中选择一种；
 */
public class test {
    public static void main(String[] args) {
        // 模拟客户端传递的促销策略key
        String promotionKey = "fr";
        PromotionStrategy strategy;
        if ("fr".equals(promotionKey)) {
            strategy = new FullReductionPromotionStrategy();
        } else if ("ds".equals(promotionKey)) {
            strategy = new DiscountPromotionStrategy();
        } else {
            throw new RuntimeException("暂不支持该促销活动");
        }
        strategy.promotion();
    }
}
