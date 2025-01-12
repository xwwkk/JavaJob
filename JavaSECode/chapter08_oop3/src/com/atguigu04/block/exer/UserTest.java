package com.atguigu04.block.exer;

/**
 * ClassName: UserTest
 * Package: com.atguigu04.block.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 上午12:28
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Jack" , "123222");
        System.out.println(u2.getInfo());

        System.out.println();
        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }
}
