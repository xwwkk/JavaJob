package com.atguigu12.wrapper.interview;

import org.testng.annotations.Test;

/**
 * ClassName: InterviewTest2
 * Package: com.atguigu12.wrapper.interview
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 05:13
 * @Version 1.0
 */
public class InterviewTest2 {
    @Test
    public void test1(){
        Integer m = 1000;
        double n = 1000;
        System.out.println(m == n);

        Integer x = 1000;
        int y = 1000;
        System.out.println(x == y);
    }
}
