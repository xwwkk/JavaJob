package com.atguigu07.object.equals.apply;

/**
 * ClassName: Account
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午9:59
 */
public class Account {
    private double balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0;
    }

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
