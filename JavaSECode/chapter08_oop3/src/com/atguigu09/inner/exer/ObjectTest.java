package com.atguigu09.inner.exer;

/**
 * ClassName: ObjectTest
 * Package: com.atguigu09.inner.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 25/12/2024 下午2:55
 */
public class ObjectTest {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("上硅谷");
            }
        }.test();
    }
}
