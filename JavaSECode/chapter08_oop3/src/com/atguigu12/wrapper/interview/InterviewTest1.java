package com.atguigu12.wrapper.interview;

import org.testng.annotations.Test;

/**
 * ClassName: InterviewTest1
 * Package: com.atguigu12.wrapper.interview
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 05:02
 * @Version 1.0
 */
public class InterviewTest1 {
    @Test
    public void test1(){
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true  valueof在-128和127之间从现有的数组取

        Integer c = -128;
        Integer v = -128;
        System.out.println(c == v);

        Integer j = 128;
        Integer k = 128;
        System.out.println(j == k);//false
    }
}
