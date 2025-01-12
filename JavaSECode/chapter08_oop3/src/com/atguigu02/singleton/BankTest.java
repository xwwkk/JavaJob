package com.atguigu02.singleton;

/**
 * ClassName: Bank
 * Package: com.atguigu02.singleton
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午8:22
 */
public class BankTest {
    Bank bank1 = Bank.getInstance();
}

class Bank {

    //1.类的构造器私有化
    private Bank(){}

    //2.在类的内部创建当前类的实例，必须声明为static
    private static Bank instance = new Bank();

    //3.使用getXxx()的方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }


}
