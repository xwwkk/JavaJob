package com.atguigu06.polymorphism;

/**
 * ClassName: PersonTest
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:19
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Man m1 = new Man();

        //多态性
        Person p2 = new Man();

        /*
        多态的应用：虚拟方法的调用

        在多态的场景下，调用方法时
            编译时，认为时父类的类型的方法
            执行时，执行的时子类的重写的方法
         */
        p2.eat();
        p2.walk();

    }
}
