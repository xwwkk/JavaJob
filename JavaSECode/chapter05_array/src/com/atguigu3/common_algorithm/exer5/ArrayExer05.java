package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu3.common_algorithm.exer05
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午8:27
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //方式1：
//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }

        //方式2：
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //方式3不推荐：
//        int[] newArr = new int[arr.length];
//        for (int i = arr.length - 1; i >= 0; i--) {
//            newArr[arr.length -1 - i] = arr[i];
//        }
//        arr = newArr;

        for (int i = 0; i < arr.length; i++) {}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
