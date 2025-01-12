package com.atguigu05._super.exer2;

/**
 * ClassName: CylinderTEst
 * Package: atguigu03._extends.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午10:49
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setLength(1.4);
        cy.setRaidus(2.3);

        System.out.println(cy.findVolume());
        System.out.println(cy.findArea());
    }
}
