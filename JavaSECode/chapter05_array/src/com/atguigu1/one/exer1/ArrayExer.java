package com.atguigu1.one.exer1;

/**
 * ClassName: ArrayExer
 * Package: com.atguigu1.one.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午3:25
 */
public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[] {8,2,1,0,3};
        int[] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};

        String tel = "";

        for (int i = 0; i < index.length; i++) {
            int value = index[i];
            tel += arr[value];
        }
        System.out.println(tel);
    }
}
