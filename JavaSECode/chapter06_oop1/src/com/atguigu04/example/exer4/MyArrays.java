package com.atguigu04.example.exer4;

/**
 * ClassName: MyArrays
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午3:07
 */
public class MyArrays {
    /**
     * 获取int[]数组的最大值
     * @param arr 要获得最大值的数组
     * @return 数组的最大值
     */
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取数组的最小值
     * @param arr
     * @return
     */
    public int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int getAvg(int[] arr){
        int sum = getSum(arr);
        return sum / arr.length;
    }

    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] copy(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public void reverse(int[] arr){
        for(int i = 0, j = arr.length -1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public void sort(int[] arr){
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
