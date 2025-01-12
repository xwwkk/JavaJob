package com.atguigu06.polymorphism.apply;

/**
 * ClassName: Dog
 * Package: com.atguigu06.polymorphism.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:32
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    @Override
    public void jump() {
        System.out.println("狗急跳墙");
    }

    public void guard(){
        System.out.println("看门");
    }
}
