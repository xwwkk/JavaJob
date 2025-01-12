package com.atguigu2.two;

/**
 * ClassName: TwoArrayTest
 * Package: com.atguigu2.two
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午3:49
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //动态初始化
        int[][] arr2 = new int[3][3];

        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int arr4[][] = new int[2][];
        int[] arr5[] = new int[2][];

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0]);

        arr4[0] = new int[]{1, 2, 3};

        System.out.println(arr4[0][0]);

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
