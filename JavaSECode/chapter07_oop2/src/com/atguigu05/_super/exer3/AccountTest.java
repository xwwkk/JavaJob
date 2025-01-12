package com.atguigu05._super.exer3;

/**
 * ClassName: AccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 上午10:39
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acct = new Account(1122,20000,0.045);

        acct.withdraw(50000);

        System.out.println("你的余额： " + acct.getBalance());

        acct.withdraw(250);
        acct.deposit(3000);

        System.out.println("你的余额： " + acct.getBalance());
        System.out.println("月利率为" + acct.getMonthlyInterestRate());
    }
}
