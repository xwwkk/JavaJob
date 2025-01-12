package com.atguigu4.search_sort.exer2;

/**
 * ClassName: BinarySearchTest
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午9:15
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr2 = {2,4,5,8,12,15,19,26,37,49,51,66,89,100};

        int target = 100;

        int head = 0;
        int end = arr2.length -1;
        int middle;

        while (head <= end){
            middle = (head + end) / 2;

            if (arr2[middle] == target){
                System.out.println(middle);
                break;
            }else if (arr2[middle] > target){
                end = middle - 1;
            }else{
                head = middle + 1;
            }
        }

        if(head > end){
            System.out.println("not found");
        }
    }
}
