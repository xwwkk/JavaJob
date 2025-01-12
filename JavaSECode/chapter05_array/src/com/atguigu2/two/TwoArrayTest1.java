package com.atguigu2.two;

/**
 * ClassName: TwoArrayTest1
 * Package: com.atguigu2.two
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午4:11
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        boolean[][] b1 = new boolean[3][2];
        //外层元素默认值
        System.out.println(b1[0]);//地址值[Z@119d7047
        //内层元素默认值
        System.out.println(b1[0][0]);

        int[][] i1 = new int[3][];
        //外层元素默认值
        System.out.println(i1[0]);
        //内层元素默认值
//        System.out.println(i1[0][0]); //NullPointerException

        String[][] s1 = new String[3][];

        System.out.println(s1[0]);

        System.out.println(s1[0][0]);
    }
}
