package com.atguigu04.override;

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
}
