package com.atguigu12.wrapper;

import org.junit.jupiter.api.Test;

/**
 * ClassName: WrapperTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 04:16
 * @Version 1.0
 */
public class WrapperTest {
    
    @Test
    public void test(){
        int i1 = 1;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());

        int i2 = 2;
        Integer ii2 = Integer.valueOf(i2);
        System.out.println(ii2.toString());

        Float ff1 = Float.valueOf("3.12");
        System.out.println(ff1);
    }
    
    @Test
    public void test2(){
        Integer ii1 = Integer.valueOf(1);
        int i1 = ii1.intValue();
        System.out.println(i1);
    }
    
    @Test
    public void test3(){
        int i1 = 1;
        Integer ii1 = i1;
        System.out.println(ii1);
        ii1++;
        System.out.println(ii1);
    }
}
