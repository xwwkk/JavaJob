package com.atguigu02.memory;

/**
 * ClassName: PersonTest
 * Package: com.atguigu02.memory
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午2:16
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "特朗普";
        p1.age = 79;
        p1.gender = '男';

        System.out.println("name=" + p1.name + ", age=" + p1.age + ", gender=" + p1.gender);

        p1.eat();
        p1.sleep();
        p1.interests("喝酒抽烟烫头");

        Person p2 = new Person();
        p2.name = "马斯克";
        p2.age = 60;
        p2.gender = '男';

        System.out.println("name=" + p2.name + ", age=" + p2.age + ", gender=" + p2.gender);

        p2.eat();
        p2.sleep();
        p2.interests("爱玩点小游戏");
    }
}
