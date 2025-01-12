package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: orderTest
 * Package: com.atguigu07.encapsulation.exer4.test1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:21
 */
public class orderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.ordreDefault = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodPublic();
    }
}
