package com.atguigu01._static.interview;

/**
 * ClassName: StaticTest
 * Package: com.atguigu01._static.interview
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午7:02
 */
public class StaticTest {
    public static void main(String[] args) {
        Order order = null;

        order.hello();
        System.out.println(order.count);
    }
}

class Order{
    public static int count = 1;
    public static void hello(){
        System.out.println("hello");
    }
}
