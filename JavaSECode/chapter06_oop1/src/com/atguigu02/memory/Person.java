package com.atguigu02.memory;

/**
 * ClassName: Person
 * Package: com.atguigu02.memory
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午2:16
 */
public class Person {

    //属性
    String name;
    public int age;
    char gender;

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void interests(String hobby){
        System.out.println("我的爱好是" + hobby);
    }
}
