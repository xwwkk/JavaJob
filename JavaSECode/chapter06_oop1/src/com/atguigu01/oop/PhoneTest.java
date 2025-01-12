package com.atguigu01.oop;

/**
 * ClassName: PhoneTest
 * Package: com.atguigu.oop1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午2:07
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();

        phone.brand = "Appel";
        phone.price = 10000;
        System.out.println(phone.brand + "的价格是" + phone.price + "刀");
        phone.call();
        phone.playGame();
        phone.sendMessage("Hello World");
    }
}
