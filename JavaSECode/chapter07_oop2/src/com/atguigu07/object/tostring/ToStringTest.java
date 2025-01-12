package com.atguigu07.object.tostring;

import java.io.File;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Package: com.atguigu07.object.tostring
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:15
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("tom", 12);
        System.out.println(u1.toString());
        System.out.println(u1);

        File file = new File("d:\\abc.txt");
        System.out.println(file.toString());

        Date date  = new Date();
        System.out.println(date.toString());
    }
}

class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "User {name=" + name + ", age=" + age + "}";
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
