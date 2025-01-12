package com.atguigu05._super.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 上午10:35
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount : " + amount);
        }else {
            System.out.println("no money");
        }
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
}
