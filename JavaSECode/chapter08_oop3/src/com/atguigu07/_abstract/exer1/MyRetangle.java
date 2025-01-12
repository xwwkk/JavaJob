package com.atguigu07._abstract.exer1;

/**
 * ClassName: MyRetangel
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午3:01
 */
public class MyRetangle extends GeometricObject {
    private double width;
    private double height;

    public MyRetangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}
