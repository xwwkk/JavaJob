package com.atguigu07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: com.atguigu07.object.tostring.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午10:29
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("red",2.0,2.3);

        System.out.println(c1.color.equals(c2.color));

        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
