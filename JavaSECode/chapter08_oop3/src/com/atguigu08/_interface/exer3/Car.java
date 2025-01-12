package com.atguigu08._interface.exer3;

/**
 * ClassName: Car
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午11:08
 */
public class Car extends Vehicle implements IPower {

    private String CarNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        CarNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽车通过内燃机行驶");
    }

    @Override
    public void power() {
        System.out.println("汽车通过汽油提高动力");
    }
}
