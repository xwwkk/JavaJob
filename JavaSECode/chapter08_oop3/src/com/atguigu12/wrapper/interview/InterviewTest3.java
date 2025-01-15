package com.atguigu12.wrapper.interview;

import org.testng.annotations.Test;

/**
 * ClassName: InterviewTest3
 * Package: com.atguigu12.wrapper.interview
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 05:15
 * @Version 1.0
 */
public class InterviewTest3 {
    @Test
    public void test1(){
        Object i = true ? new Integer(1) : new Double(2.0);
        System.out.println(i);

        Object o;
        if(true){
            o = new Integer(1);
        }else{
            o = new Double(2.0);
        }

        System.out.println(o);
    }
}
