package com.atguigu05.method_more._03valuetransfer;

import com.atguigu02.memory.Person;

/**
 * ClassName: ValueTransferTest1
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午11:52
 */
public class ValueTransferTest1 {
    public static void main(String[] args) {
        //1.基本数据类型
        int m = 10;

        ValueTransferTest1 test = new ValueTransferTest1();

        test.method1(m);

        System.out.println(m);
        //2.引用数据类型
        Person p1 = new Person();

        p1.age =10;

        test.method2(p1);

        System.out.println(p1.age);
    }

    public void method1(int m){
        m++;
    }
    public void method2(Person p){
        p.age++;
    }
}
