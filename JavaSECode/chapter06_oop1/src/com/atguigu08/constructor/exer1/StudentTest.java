package com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:19
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("lb",18 );
        System.out.println(s1.getInfo());
        Student s2 = new Student("lb",18, "bj");
        System.out.println(s2.getInfo());
        Student s3 = new Student("lb",18, "bj", "dn");
        System.out.println(s3.getInfo());
    }
}
