package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午11:43
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m; //传递的是数值
        System.out.println("m=" + m + ",n=" + n);

        m++;

        System.out.println("m=" + m + ",n=" + n);

        //2.引用数据类型的局部变量
        //2.1数组类型
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1; //传递的是地址值

        arr2[0] = 10;

        System.out.println(arr1[0]);

        //2.2对象类型
        Order order1 = new Order();
        order1.orderId = 1;

        Order order2 = order1; //传递的是地址值
        order2.orderId = 2;

        System.out.println(order1.orderId);
        System.out.println(order2.orderId);
    }
}

class Order{
    int orderId;
}