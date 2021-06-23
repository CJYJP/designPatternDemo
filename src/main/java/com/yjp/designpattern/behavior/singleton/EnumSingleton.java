package com.yjp.designpattern.behavior.singleton;

/**
 * 枚举单例模式是推荐的单例模式，它不仅可以防御序列化攻击，也可以防御反射攻击。举个枚举单例模式的代码：
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        EnumSingleton newInstance = EnumSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
    }
}
