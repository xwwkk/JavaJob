package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest2
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午12:01
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        int temp = m;
        m = n;
        n = temp;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(m, n);

        System.out.println(m);
        System.out.println(n);
    }

    public void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
