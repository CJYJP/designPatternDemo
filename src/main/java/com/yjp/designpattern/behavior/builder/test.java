package com.yjp.designpattern.behavior.builder;

import com.yjp.designpattern.behavior.factoryapproach.AppleFruitFactory;
import com.yjp.designpattern.behavior.factoryapproach.FruitFactory;
import com.yjp.designpattern.behavior.simplefactory.Fruit;

public class test {

    /**
     * 适用于：
     *
     * 1 一个对象有非常复杂的内部结构（很多属性）
     * 2 想将复杂对象的创建和使用分离。
     * 优点：
     *
     * 1 封装性好，创建和使用分离
     * 2 拓展性好，建造类之间独立，一定程度上解耦。
     * 缺点：
     *
     * 1 产生多余的Builder对象；
     * 2 产品内部发生变化，建造者需要更改，成本较大。
     * @param args
     */
        public static void main(String[] args) {
            ShopBuilder builder = new FruitShopBuilder();
            Dealer dealer = new Dealer();
            dealer.setBuilder(builder);

            Shop shop = dealer.build("XX水果店", "深圳市XX区XX街XX号", "水果经营");
            System.out.println(shop);
        }
}
