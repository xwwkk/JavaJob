package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: Order
 * Package: com.atguigu07.encapsulation.exer4.test1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:17
 */
public class Order {
    private int ordrePrivate;
    int ordreDefault;
    public int orderPublic;

    private void methodPrivate() {}
    void methodDefault() {}
    public void methodPublic() {}

    public void test(){
        ordrePrivate = 1;
        ordreDefault = 1;
        orderPublic = 1;
        methodPrivate();
        methodDefault();
        methodPublic();
    }
}
