package com.atguigu08._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午11:06
 */
public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
