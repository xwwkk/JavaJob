package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: atguigu04.override.test2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午11:09
 */
public class OrderTest {
    public void method(){
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();
    }
}
