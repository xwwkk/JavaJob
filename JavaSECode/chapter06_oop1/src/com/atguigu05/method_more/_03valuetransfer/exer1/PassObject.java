package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午12:08
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle,5);

        System.out.println("now radius is:" + circle.radius);
    }
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        int i = 1;
        for (; i < 6; i++) {
            c.radius = i;
            System.out.println(c.radius+ "\t\t" + c.findArea());
        }
        System.out.println();
        c.radius = i;
    }
}
