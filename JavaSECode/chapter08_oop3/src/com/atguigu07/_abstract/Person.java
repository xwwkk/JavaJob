package com.atguigu07._abstract;

/**
 * ClassName: Person
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午2:46
 */
public abstract class Person extends Creature{
    String name;
    int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();
}
