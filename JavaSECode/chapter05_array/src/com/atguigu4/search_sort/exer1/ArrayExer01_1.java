package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午8:51
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int[] newArr = new int[arr.length << 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        arr = newArr;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
