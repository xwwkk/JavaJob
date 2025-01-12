package com.atguigu05.method_more._02args;

/**
 * ClassName: ArgsTest
 * Package: com.atguigu05.method_more._02args
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午4:42
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();
        test.print(1,2,3,4,5,6,7,8,9);
        test.print(1,2.0);
    }

    public void print(int ... nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void print(int i,double ... nums){
        if (i > 2){
            for (int j = 0; j < nums.length; j++) {
                System.out.print("1111");
            }
        }
    }
}
