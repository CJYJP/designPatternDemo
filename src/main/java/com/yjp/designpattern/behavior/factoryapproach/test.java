package com.yjp.designpattern.behavior.factoryapproach;

import com.yjp.designpattern.behavior.simplefactory.Fruit;

public class test {

    /**
     * 定义：定义创建对象的接口，让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到了子类进行。
     *
     * 优点：具体产品从客户端代码中抽离出来，解耦。
     *
     * 加入新的类型时，只需添加新的工厂方法（无需修改旧的工厂方法代码），符合开闭原则。
     *
     * 缺点：类的个数容易过多，增加复杂度。
     * @param args
     */
    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        Fruit fruit = factory.produceFruit();
        fruit.eat();
    }
}
