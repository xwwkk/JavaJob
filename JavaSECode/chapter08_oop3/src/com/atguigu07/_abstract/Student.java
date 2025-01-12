package com.atguigu07._abstract;

/**
 * ClassName: Student
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午2:47
 */
public class Student extends Person{
    String school;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生多吃");
    }

    @Override
    public void sleep() {
        System.out.println("学生多睡");
    }

    @Override
    public void breath() {
        System.out.println("学生多呼吸");
    }
}
