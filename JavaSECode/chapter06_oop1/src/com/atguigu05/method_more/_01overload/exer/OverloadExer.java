package com.atguigu05.method_more._01overload.exer;

/**
 * ClassName: OverloadExer
 * Package: com.atguigu05.method_more._01overload.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午4:27
 */
public class OverloadExer {
    public void mOL(int i){
        System.out.println(i * i);
    }
    public void mOL2(int i1, int i2){
        System.out.println(i1 * i2);
    }
    public void mOL3(String s){
        System.out.println(s);
    }

    public int max(int a, int b){
        return a > b ? a : b;
    }

    public double max(double a, double b){
        return a > b ? a : b;
    }

    public double max(double a, double b, double c){
        double max = max(a, b);
        max = max(max, c);
        return max;
    }
}
