package com.atguigu3.common_algorithm.exer2;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu3.common_algorithm.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午7:27
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = {5, 4, 6, 8, 9, 0, 1, 2, 7, 3};

        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }

        sum = sum - max - min;


        sum = sum / (scores.length - 2);

        System.out.println(sum);
    }
}
