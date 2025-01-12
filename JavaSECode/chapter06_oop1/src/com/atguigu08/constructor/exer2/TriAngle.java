package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngle
 * Package: com.atguigu08.constructor.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:22
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double findAreas() {
        return base * height / 2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
