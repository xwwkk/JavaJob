package com.atguigu05._super.exer3;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 上午10:42
 */
public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }else if(amount <= getBalance() + getOverdraft()){
            setOverdraft(getOverdraft() + getBalance() - amount);
            setBalance(0);
        }else{
            System.out.println("超过可透支额");
        }
    }
}
