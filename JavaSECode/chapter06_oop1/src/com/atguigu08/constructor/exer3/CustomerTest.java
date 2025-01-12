package com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:32
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");

        customer.setAccount(new Account(1000, 2000, 1.23));

        customer.getAccount().deposit(100);

        customer.getAccount().withdraw(960);

        customer.getAccount().withdraw(2000);

        System.out.println("Name： " + customer.getFirstName() + customer.getLastName() + "，accountId： " + customer.getAccount().getId() + ",balance: " + customer.getAccount().getBalance());
    }
}
