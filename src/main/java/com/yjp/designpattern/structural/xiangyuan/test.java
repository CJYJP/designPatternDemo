package com.yjp.designpattern.structural.xiangyuan;

import com.yjp.designpattern.structural.decorator.AbstractFruitSalad;
import com.yjp.designpattern.structural.decorator.FruitSalad;
import com.yjp.designpattern.structural.decorator.KiwiDecorator;
import com.yjp.designpattern.structural.decorator.WaterMelonDecorator;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

/**
 * 享元模式
 * 提供了减少对象数量从而改善应用所需的对象结构的方式，运用共享技术有效地支持大量细粒度的对象。
 *
 * 适用于：
 *
 * 底层系统开发，解决性能问题；
 * 系统拥有大量相似对象，需要缓冲池的场景。
 * 优点：
 *
 * 减少对象的创建，降低内存占用；
 * 缺点：
 *
 * 关注内/外部状态，关注线程安全问题；
 * 程序的逻辑复杂化。
 * 内部状态：简单理解为享元对象的属性状态，不会因为外部的改变而改变； 外部状态：简单理解为方法参数。
 */
public class test {
    private static final String[] PIE = {"🍇派", "🍈派", "🍓派", "🍒派"};

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach((i) -> {
            String name = PIE[(int) (Math.random() * PIE.length)];
            FruitPie fruitPie = FruitPieFactory.produce(name);
            fruitPie.setProductTime(LocalDateTime.now());
            fruitPie.make();
        });
    }
}
