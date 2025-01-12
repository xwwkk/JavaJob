package com.atguigu01._static.exer2;

/**
 * ClassName: MyArraysTEst
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午3:09
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {34,56,233,2,56,24,56,67,778,45};

        System.out.println(MyArrays.getMax(arr));
        System.out.println(MyArrays.getMin(arr));
        System.out.println(MyArrays.getSum(arr));
        System.out.println(MyArrays.getAvg(arr));

        System.out.println(MyArrays.search(arr, 34));

        MyArrays.print(arr);
        MyArrays.sort(arr);
        MyArrays.print(arr);
        MyArrays.reverse(arr);
        MyArrays.print(arr);
    }
}
