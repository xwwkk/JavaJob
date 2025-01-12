package com.atguigu5.arrays;

import java.util.Arrays;

/**
 * ClassName: ArraysTest
 * Package: com.atguigu5.arrays
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午12:10
 */
public class ArraysTest {
    public static void main(String[] args) {
        //1. boolean equals(int[] a, int[] b)
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4};

        boolean b1 = Arrays.equals(arr1, arr2);

        System.out.println(b1);

        //2. String toString(int[] a)
        String s1 = Arrays.toString(arr1);
        System.out.println(s1);

        //3. void fill(int[] a, int val)
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //4. void sort(int[] a)
        int[] arr3 = new int[] {34,54,3,2,65,7,34,5,76,34,67};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        // int binarySearch(int[] a, int key)
        int index = Arrays.binarySearch(arr3, 5);
        System.out.println(index);
    }
}
