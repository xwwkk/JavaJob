package com.atguigu05._super.exer1;

/**
 * ClassName: KidsTest
 * Package: atguigu03._extends.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:53
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids(1,1000,14);

        kid.setSalary(100);
        kid.setYearsOld(13);

        kid.employeed();
        kid.manOrWoman();
        kid.printAge();
    }
}
