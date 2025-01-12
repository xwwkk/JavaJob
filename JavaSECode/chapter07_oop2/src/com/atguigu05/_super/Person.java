package com.atguigu05._super;

/**
 * ClassName: Person
 * Package: atguigu03._extends
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:23
 */
public class Person {
    String name;
    int age;

    int id = 1001;//身份证号

    public Person() {
        System.out.println("Person constructor");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(){
        System.out.println("人睡觉");
    }

    public void doSport(){
        System.out.println("人运动");
    }
}
