package com.atguigu07._abstract;

/**
 * ClassName: Worker
 * Package: com.atguigu07._abstract
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午3:02
 */
public class Worker extends Person{

    @Override
    public void eat() {
        System.out.println("多吃");
    }

    @Override
    public void sleep() {
        System.out.println("多睡");
    }

    @Override
    public void breath() {
        System.out.println("多呼吸");
    }
}
