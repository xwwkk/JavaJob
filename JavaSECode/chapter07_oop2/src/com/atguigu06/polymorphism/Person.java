package com.atguigu06.polymorphism;

/**
 * ClassName: Person
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:14
 */
public class Person {
    String name;
    int age;
    int id = 1001;

    public void eat(){
        System.out.println("eat");
    }

    public void walk(){
        System.out.println("walk");
    }
}
