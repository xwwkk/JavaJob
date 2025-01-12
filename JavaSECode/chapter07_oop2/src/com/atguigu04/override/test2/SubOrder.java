package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

/**
 * ClassName: SubOrder
 * Package: atguigu04.override.test2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午11:04
 */
public class SubOrder extends Order {
    public void method(){

        orderProtected = 1;
        orderPublic = 1;

        //orderPrivate = 1;
        //orderDefault = 1;

        methodProtected();
        methodPublic();
    }
}
