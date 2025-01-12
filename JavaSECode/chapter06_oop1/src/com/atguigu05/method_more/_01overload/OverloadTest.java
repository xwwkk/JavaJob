package com.atguigu05.method_more._01overload;

/**
 * ClassName: OverloadTest
 * Package: com.atguigu05.method_more._01overload
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午4:17
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();
        test.add(2,3);
    }
    public void add(int i, int j) {
        System.out.println("11111");
    }
    public void add(int i, int j, int k) {}
    public void add(String s1, String s2) {}
    public void add(int i, String s) {}
    public void add(String s, int i) {}
    public void add(double d1, double d2) {
        System.out.println("3333");
    }
}

