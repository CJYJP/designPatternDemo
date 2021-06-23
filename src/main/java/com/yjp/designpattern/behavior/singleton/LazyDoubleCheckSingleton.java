package com.yjp.designpattern.behavior.singleton;

/**
 * 双重同步锁单例模式
 */
public class LazyDoubleCheckSingleton {
    /**
     * 但是由于指令重排的原因，某些线程可能会获取到空对象，后续对该对象的操作将触发空指针异常。
     * 要修复这个问题，只需要阻止指令重排即可，所以可以给instance属性加上volatile关键字
     */
    private volatile static LazyDoubleCheckSingleton instance = null;
    //private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
