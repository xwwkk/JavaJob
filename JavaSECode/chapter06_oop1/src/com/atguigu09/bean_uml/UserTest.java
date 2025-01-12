package com.atguigu09.bean_uml;

/**
 * ClassName: UserTest
 * Package: com.atguigu09.bean_uml
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:45
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println(u1.age);

        User u2 = new User(2);

        System.out.println(u2.age);
    }
}

class User{
    String name;
    int age = 10;

    public User(){}

    public User(int age){
        this.age = age;
    }
}
