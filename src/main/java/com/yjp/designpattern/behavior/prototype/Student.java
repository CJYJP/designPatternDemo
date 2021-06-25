package com.yjp.designpattern.behavior.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * 原型实例指定创建对象的种类，通过拷贝这些原型创建新的对象。
 *
 * 适用于：
 *
 * 类初始化消耗较多资源；
 * 循环体中生产大量对象的时候。
 * 优点：
 *
 * 原型模式性能比直接new一个对象性能好；
 * 简化创建对象过程。
 * 缺点：
 *
 * 对象必须重写Object克隆方法；
 * 复杂对象的克隆方法写起来较麻烦（深克隆、浅克隆）
 */
@Data
public class Student implements Cloneable {

    private String name;
    private int age;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        /*Student student = (Student) super.clone();
        // 引用类型深克隆
        Date birthday = (Date) student.getBirthday().clone();
        student.setBirthday(birthday);
        return student;*/
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        ArrayList<Student> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student s = (Student) student.clone();
            s.setName("学生" + i);
            s.setAge(20 + i);
            list.add(s);
        }
        System.out.println(list);
    }
}
