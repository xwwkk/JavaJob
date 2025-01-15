package com.atguigu12.wrapper;

import org.testng.annotations.Test;

/**
 * ClassName: WrapperTest1
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 04:38
 * @Version 1.0
 */
public class WrapperTest1 {
    @Test
    public void test1() {
        int i1 = 1;
        String str1 = String.valueOf(i1);
        System.out.println(str1);
    }

    @Test
    public void test2() {
        String str1 = "123";
        Integer ii1 = Integer.parseInt(str1);
        System.out.println(ii1);
    }
}
