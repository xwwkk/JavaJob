package com.atguigu10._enum.exer1;

/**
 * ClassName: BankTest1
 * Package: com.atguigu10._enum.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 26/12/2024 下午12:12
 */
public class BankTest1 {
    public static void main(String[] args) {
        Bank1.instance.id = 2;
        System.out.println(Bank1.instance.id);
    }
}

class Bank1{
    public int id;

    private Bank1(){
    }

    public static final Bank1 instance = new Bank1();

}

enum Bank2{
    CPB;
}

enum GirlFriend{
    Xiaoli(18);

    private final int age;

    private GirlFriend(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
