package com.atguigu05.method_more._03valuetransfer.exer2;

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
        MyArrays myArrays = new MyArrays();
        int[] arr = {34,56,233,2,56,24,56,67,778,45};

        System.out.println(myArrays.getMax(arr));
        System.out.println(myArrays.getMin(arr));
        System.out.println(myArrays.getSum(arr));
        System.out.println(myArrays.getAvg(arr));

        System.out.println(myArrays.search(arr, 34));

        myArrays.print(arr);
        myArrays.sort(arr,"desc");
        myArrays.print(arr);
        myArrays.reverse(arr);
        myArrays.print(arr);
    }
}
