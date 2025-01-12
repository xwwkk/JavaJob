package com.atguigu4.search_sort.exer3;

/**
 * ClassName: BubbleSortTest
 * Package: com.atguigu4.search_sort.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 上午11:36
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[] {34,54,3,2,65,7,34,5,76,34,67};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
