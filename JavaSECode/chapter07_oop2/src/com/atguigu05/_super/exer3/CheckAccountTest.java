package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 上午10:51
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);

        checkAccount.withdraw(5000);
        System.out.println("你的账户余额：" + checkAccount.getBalance());
        System.out.println("你的可透支余额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("你的账户余额：" + checkAccount.getBalance());
        System.out.println("你的可透支余额：" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("你的账户余额：" + checkAccount.getBalance());
        System.out.println("你的可透支余额：" + checkAccount.getOverdraft());
    }
}
