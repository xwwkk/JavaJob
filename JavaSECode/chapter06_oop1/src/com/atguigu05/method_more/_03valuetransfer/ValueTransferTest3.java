package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 上午12:03
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.m = 10;
        data1.n = 20;
        System.out.println(data1.m);
        System.out.println(data1.n);

        ValueTransferTest3 test = new ValueTransferTest3();
        test.swap(data1);

        System.out.println(data1.m);
        System.out.println(data1.n);
    }

    public void swap(Data data) {
        int temp = data.n;
        data.n = data.m;
        data.m = temp;
    }
}

class Data{
    int m;
    int n;
}
