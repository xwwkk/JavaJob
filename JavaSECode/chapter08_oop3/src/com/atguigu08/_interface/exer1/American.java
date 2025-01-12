package com.atguigu08._interface.exer1;

/**
 * ClassName: American
 * Package: com.atguigu08._interface.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:46
 */
public class American implements Eatable{

    @Override
    public void eat() {
        System.out.println("美国人使用刀叉吃饭");
    }
}
