package com.atguigu04.override.exer2;

/**
 * ClassName: Circle
 * Package: atguigu03._extends.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午10:46
 */
public class Circle {
    private double raidus;

    public Circle() {
        this.raidus = 1;
    }
    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public double findArea(){
        return Math.PI * Math.pow(raidus, 2);
    }
}
