package com.atguigu11.annotation.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUintTest
 * Package: com.atguigu11.annotation.junit
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/14 21:24
 * @Version 1.0
 */
public class JUintTest { //单元测试类
    @Test
    public void Test1(){ //单元测试方法
        System.out.println("hello junit");
    }

    @Test
    public void Test2(){ //单元测试方法
        int i = 1;
        System.out.println(i);
        method();
    }

    @Test
    public void Test3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");
        int num = sc.nextInt();

        System.out.println(num);
    }
    
    @Test
    public void test4(){
        System.out.println("自动生成");
    }

    public void method(){
        System.out.println("method");
    }
}
