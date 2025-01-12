package com.atguigu08._interface.exer2;

/**
 * ClassName: Circle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:51
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
