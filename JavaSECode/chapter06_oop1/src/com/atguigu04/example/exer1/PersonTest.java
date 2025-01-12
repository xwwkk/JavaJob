package com.atguigu04.example.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu04.example.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午2:50
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Tom";
        p1.age = 18;
        p1.gender = '男';

        p1.study();
        int age = p1.showAge();
        System.out.println(age);

        p1.addAge(2);
        age = p1.showAge();
        System.out.println(age);

        Person p2 = new Person();

        System.out.println(p2.age);

        p2.addAge(10);

        System.out.println(p2.showAge());
    }
}
