package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_2
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午8:58
 */
public class ArrayExer01_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //方式1：
        for (int i = 4; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = 0;

        //方式2（不常用）：
//        int[] newArr = new int[arr.length - 1];
//        for (int i = 0; i < arr.length; i++) {
//            if (i < 4) {
//                newArr[i] = arr[i];
//            } else if (i > 4) {
//                newArr[i - 1] = arr[i];
//            }
//        }
//
//        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
