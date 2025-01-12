package com.atguigu08.constructor.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:26
 */
public class Account {
    private int id;
    private double balance;
    private double annualinterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualinterestRate = a;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualinterestRate;
    }

    public void setId(int i){
        id = i;
    }

    public void setBalance(double b){
        balance = b;
    }

    public void setAnnualInterestRate(double a){
        annualinterestRate = a;
    }

    public void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("取款成功 : " + amount);
            return;
        }
        System.out.println("余额不足，取款失败");
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("存款成功 : " + amount);
        }
    }
}
