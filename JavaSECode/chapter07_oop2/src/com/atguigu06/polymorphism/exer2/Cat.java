package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: cCat
 * Package: com.atguigu06.polymorphism.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:33
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫咪跳");
    }

    public void catchmouse(){
        System.out.println("猫能抓老鼠");
    }
}
