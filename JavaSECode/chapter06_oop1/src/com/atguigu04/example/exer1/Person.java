package com.atguigu04.example.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午2:49
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age+=addAge;
    }
}
