package com.atguigu08.constructor.exer3;

/**
 * ClassName: Customer
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:25
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}
