package com.atguigu03._extends;

/**
 * ClassName: RextendsTEst
 * Package: atguigu03._extends
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:25
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tony";
        p1.eat();
        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Jack";
        s1.eat();

        System.out.println(s1.getClass().getSuperclass());
        System.out.println(p1.getClass().getSuperclass());
    }
}
