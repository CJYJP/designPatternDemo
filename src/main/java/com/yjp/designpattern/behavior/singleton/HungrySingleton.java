package com.yjp.designpattern.behavior.singleton;

import java.io.*;

/**
 * 饿汉单例模式
 * “饿汉”意指在类加载的时候就初始化
 */
public class HungrySingleton  {

    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}
