package com.atguigu4.search_sort.exer2;

/**
 * ClassName: ArrayExer02_1
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午9:06
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = {34,54,3,2,65,7,34,5,76,34,67};

        int target = 5;

        int i;
        for (i = 0; i < arr1.length; i++) {
            if(arr1[i] == target){
                System.out.println(i);
                break;
            }
        }
        if(i == arr1.length){
            System.out.println("not found");
        }
    }
}
