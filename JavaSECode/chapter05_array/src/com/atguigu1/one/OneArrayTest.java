package com.atguigu1.one;

/**
 * ClassName: OneArrayTest
 * Package: com.atguigu1.one
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午2:01
 */
public class OneArrayTest {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[] {20.32,43.21,43.22};

        String[] foods = new String[4];

        int arr[] = new int[4];
        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        System.out.println(prices[0]);
        System.out.println(prices[2]);
//        System.out.println(prices[3]); //ArrayIndexOutOfBoundsException

        foods[0] = "拌海蜇";
        foods[1] = "龙须菜";
        foods[2] = "强冬笋";
        foods[3] = "玉米片";

        System.out.println(foods.length);
        System.out.println(prices.length);

        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }

        for(int i = 0; i < foods.length; i++){
            System.out.println(foods[i]);
        }
    }
}