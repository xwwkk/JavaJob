package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 上午12:19
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    public void toilet(){
        System.out.println("女人去女厕");
    }

    public void makeup(){
        System.out.println("厕后补妆");
    }
}
