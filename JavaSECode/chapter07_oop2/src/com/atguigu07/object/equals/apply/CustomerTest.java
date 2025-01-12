package com.atguigu07.object.equals.apply;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:01
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 12, new Account(1200));
        Customer c2 = new Customer("Tom", 12, new Account(1200));

        System.out.println(c1.equals(c2));
    }
}
