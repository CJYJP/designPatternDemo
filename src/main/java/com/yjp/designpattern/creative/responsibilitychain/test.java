package com.yjp.designpattern.creative.responsibilitychain;

/**
 * 职责链模式为请求创建一个接收此次请求对象的链。
 *
 * 适用于：
 *
 * 一个请求的处理需要多个对象当中的一个或几个协作处理；
 * 优点：
 *
 * 请求的发送者和接受者（请求的处理）解耦；
 * 职责链可以动态的组合。
 * 缺点：
 *
 * 职责链太长或者处理时间过长，影响性能；
 * 职责链可能过多。
 */
public class test {

    public static void main(String[] args) {
        StringValidator lengthValidator = new StringLengthValidator();
        StringValidator valueValidator = new StringValueValidator();

        lengthValidator.setNextValidator(valueValidator);
        lengthValidator.check("hello");
    }
}
