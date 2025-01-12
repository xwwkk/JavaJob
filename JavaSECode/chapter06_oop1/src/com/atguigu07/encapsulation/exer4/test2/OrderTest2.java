package com.atguigu07.encapsulation.exer4.test2;

import com.atguigu07.encapsulation.exer4.test1.Order;

/**
 * ClassName: OrderTest2
 * Package: com.atguigu07.encapsulation.exer4.test2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:23
 */
public class OrderTest2 {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();
    }
}
