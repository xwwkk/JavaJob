package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu2.two.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午6:58
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
