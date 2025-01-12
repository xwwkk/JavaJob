package com.atguigu07.object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:24
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
