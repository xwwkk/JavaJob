package com.atguigu05._super.exer2;

/**
 * ClassName: Cylinder
 * Package: atguigu03._extends.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午10:47
 */
public class Cylinder extends Circle {
    private double length;

    Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return 2 * Math.PI * getRaidus() * length + 2 * getRaidus() * getRaidus() * Math.PI;
    }
}
