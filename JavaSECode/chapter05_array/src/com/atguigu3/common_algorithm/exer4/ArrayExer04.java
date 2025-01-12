package com.atguigu3.common_algorithm.exer4;

/**
 * ClassName: ArrayExer04
 * Package: com.atguigu3.common_algorithm.exer04
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午8:13
 */
public class ArrayExer04 {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        int[] array2 = array1;

        for (int i = 0; i < array2.length; i += 2) {
            array2[i] = i;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
