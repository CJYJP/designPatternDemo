package com.yjp.designpattern.behavior.prototype;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Student implements Cloneable {

    private String name;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
