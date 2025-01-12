package com.atguigu3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu3.common_algorithm.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午7:21
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int mean = sum / arr.length;

        System.out.println();
        System.out.println(max + " " + min + " " + " " + sum + " " + mean);
    }
}
