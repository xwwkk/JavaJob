package com.atguigu05._super;

/**
 * ClassName: Student
 * Package: atguigu03._extends
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:24
 */
public class Student extends Person {
    String school;

    int id = 1002;//学号

    public Student() {
        super();
        System.out.println("Student constructor");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    @Override
    public void eat(){
        System.out.println("学生要吃好");
    }

    @Override
    public void sleep() {
        System.out.println("学生要睡好");
    }

    public void study(){
        System.out.println("学生学习");
    }

    public void show(){
        super.eat();
    }

    public void show1(){
        doSport();
    }

    public void show2(){
        System.out.println(id);
        System.out.println(super.id);
    }

    public void show3(){
        System.out.println(name);
    }
}
