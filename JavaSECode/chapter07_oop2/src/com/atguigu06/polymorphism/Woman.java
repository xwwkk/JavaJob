package com.atguigu06.polymorphism;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:17
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("女人减肥");
    }

    public void walk(){
        System.out.println("女人窈窕走路");
    }

    public void goShopping(){
        System.out.println("女人喜欢逛街");
    }
}

