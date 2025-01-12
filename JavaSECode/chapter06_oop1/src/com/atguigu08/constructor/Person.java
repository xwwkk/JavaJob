package com.atguigu08.constructor;

/**
 * ClassName: Person
 * Package: com.atguigu08.constructor
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午11:44
 */
public class Person {
    String name;
    int age;

//    public Person(){
//        System.out.println(",,,,,");
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(int hour){
        System.out.println("sleep" + hour);
    }
}
