package com.atguigu01._static.exer1;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午6:54
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1);

        Account acc2 = new Account("111111",2020);
        System.out.println(acc2);

        Account.setInterestRate(0.0123);
        System.out.println(Account.getInterestRate());
        System.out.println(Account.getMinBalance());
    }
}
