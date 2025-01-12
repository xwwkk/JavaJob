package com.atguigu04.override.test1;

/**
 * ClassName: OrderTest
 * Package: atguigu04.override.test1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午11:02
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 1;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
