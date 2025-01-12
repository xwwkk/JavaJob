package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecursionExer01
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午10:30
 */
public class RecursionExer01 {
    public static void main(String[] args) {
        RecursionExer01 test = new RecursionExer01();
        System.out.println(test.f1(10));
    }
    public int f1(int n){
        if(n == 20){
            return 1;
        }else if(n == 21){
            return 4;
        }else{
            return f1(n + 2) - 2*f1(n +1);
        }
    }

    public int f2(int n){
        if(n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else{
            return f2(n - 2) + 2*f2(n - 1);
        }
    }
}
