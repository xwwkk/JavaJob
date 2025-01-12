package com.atguigu07._abstract.exer1;

/**
 * ClassName: GeometricTest
 * Package: com.atguigu06.polymorphism.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午3:02
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        GeometricObject c1 = new Circle("yellow", 1, 2.3);
        GeometricObject c2 = new Circle("yellow", 1, 2.3);

        test.displayGeometricObject(c1);

        System.out.println(test.equalsArea(c1, c2));
    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g1){
        System.out.println(g1.findArea());
    }
}
