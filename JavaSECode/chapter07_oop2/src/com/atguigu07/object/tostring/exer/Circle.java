package com.atguigu07.object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:25
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
//        color = "white";
//        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
//        color = "white";
//        weight = 1.0;
        this.radius = radius;
    }

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

    public double findArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
