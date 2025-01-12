package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:07
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"A");
        Order order2 = new Order(1001,"A");

        Order order3 = new Order(1002,"B");
        Order order4 = new Order(1002,"B");


        System.out.println(order1.equals(order2));
        System.out.println(order3.equals(order4));

        String str1 = "aa";
        String str2 = "aa";

        System.out.println(str1 == str2);
    }
}
