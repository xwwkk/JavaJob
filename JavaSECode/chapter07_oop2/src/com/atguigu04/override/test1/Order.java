package com.atguigu04.override.test1;

/**
 * ClassName: Order
 * Package: atguigu04.override.test1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午11:00
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}
}
