package com.atguigu01._static.apply;

/**
 * ClassName: CircleTest
 * Package: com.atguigu01._static.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午6:44
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(Circle.total);
        System.out.println(c1.getId());

        Circle c2 = new Circle();
        System.out.println(Circle.total);
        System.out.println(c2.getId());
    }
}

class Circle{
    private double radius;

    private int id;

    public static int total = 0;

    private static int init = 1001;

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.id = init++;
        total++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
