package com.atguigu07._abstract.exer1;

/**
 * ClassName: Circle
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:59
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
