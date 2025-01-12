package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 上午12:17
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人去男厕");
    }

    public void smoke(){
        System.out.println("厕后一口烟");
    }
}
