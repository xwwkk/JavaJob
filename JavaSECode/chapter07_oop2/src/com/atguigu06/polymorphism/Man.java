package com.atguigu06.polymorphism;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:15
 */
public class Man extends Person {
    boolean isSmoking;
    int id = 1002;

    @Override
    public void eat() {
        System.out.println("男人爱吃肉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路");
    }

    public void earn(){
        System.out.println("男人挣钱");
    }
}
