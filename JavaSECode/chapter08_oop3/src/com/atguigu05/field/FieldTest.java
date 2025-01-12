package com.atguigu05.field;

/**
 * ClassName: FieldTest
 * Package: com.atguigu05.field
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午1:36
 */
public class FieldTest{
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{
    {
        orderId = 2;
    }

    int orderId = 1;

    public Order(){
        orderId = 3;
    }
}
