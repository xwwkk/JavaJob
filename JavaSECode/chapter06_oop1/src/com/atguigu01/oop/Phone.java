package com.atguigu01.oop;

/**
 * ClassName: Phone
 * Package: com.atguigu.oop1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午2:04
 */
public class Phone {

    //属性
    String brand;
    double price;

    //方法
    public void call(){
        System.out.println("打电话");
    }

    public void sendMessage(String message){
        System.out.println("发信息：\t" + message);
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}
