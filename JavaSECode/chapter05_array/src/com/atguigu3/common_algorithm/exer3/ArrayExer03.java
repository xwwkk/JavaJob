package com.atguigu3.common_algorithm.exer3;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu3.common_algorithm.exer03
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午7:56
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];

        arr[0] = new int[] {1};

        for (int i = 1; i < arr.length; i++) {
            arr[i] = new int[i+1];
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j <= i -1; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
