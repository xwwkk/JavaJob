package com.atguigu08._interface.exer1;

/**
 * ClassName: Chinest
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:45
 */
public class Chinese implements Eatable{

    @Override
    public void eat() {
        System.out.println("中国使用筷子吃饭");
    }
}
