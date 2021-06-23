package com.yjp.designpattern.behavior.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {
    /**
     * 单例模式目的是为了一个类只有一个实例。
     *
     * 优点：
     *
     * 内存中只有一个实例，减少了内存开销；
     * 可以避免对资源的多重占用；
     * 设置全局访问点，严格控制访问。
     * 缺点：
     *
     * 没有接口，拓展困难。
     */
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;

        /**
         * 加同步锁解决线程安全问题
         */
        /*synchronized (LazySingleton.class) {
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;*/
    }
}
