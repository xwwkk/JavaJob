package com.atguigu05.method_more._04recursion.exer2;

/**
 * ClassName: RabbitExer
 * Package: com.atguigu05.method_more._04recursion.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午10:37
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer test = new RabbitExer();

        System.out.println(test.getRabbitNumber(24));
    }
    public int getRabbitNumber(int month){
        if(month == 1){
            return 1;
        }else if(month == 2){
            return 1;
        }else{
            return getRabbitNumber(month-1) + getRabbitNumber(month-2);
        }
    }
}
