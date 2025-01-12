package com.atguigu05._super;

/**
 * ClassName: StudentTest
 * Package: com.atguigu05._super
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 上午9:59
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Tom",11, "wudi");
        s1.eat();
        s1.sleep();

        s1.show();

        s1.doSport();

        s1.show2();
    }
}
