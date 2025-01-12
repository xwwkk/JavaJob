package com.atguigu6.exception;

/**
 * ClassName: ArrayExceptionTest
 * Package: com.atguigu6.exception
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午12:25
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        System.out.println(arr[10]);

        int[] arr1 = new int[10];
        arr1 = null;
//        System.out.println(arr1[0]);

        int[][] arr2 = new int[3][];
//        System.out.println(arr2[0][0]);

        String[] arr3 = new String[4];
        System.out.println(arr3[0]);
        System.out.println(arr3);
//        System.out.println(arr3[0].toString());
    }
}
