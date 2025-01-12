package com.atguigu05.method_more._04recursion;

/**
 * ClassName: RecursionTest
 * Package: com.atguigu05.method_more._04recursion
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午10:14
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

//        test.method1();

        System.out.println(test.getSum(100));

        System.out.println(test.getMulti(5));

        System.out.println(test.f(5));
    }

//    StackOverflowError
//    public void method1(){
//        method1();
//    }

    public int getSum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getSum(num - 1) + num;
        }
    }

    public int getMulti(int num) {
        if (num == 1) {
            return 1;
        } else {
            return getMulti(num - 1) * num;
        }
    }

    public int f(int n){
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 1;
        }else{
            return f(n-1) + f(n-2);
        }
    }
}


