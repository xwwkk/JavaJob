package com.atguigu04.block;

/**
 * ClassName: BlockTest
 * Package: com.atguigu04.block
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 上午12:05
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        System.out.println(Person.info);

        Person p1 = new Person();
//        p1.eat();
    }
}

class Person{
    String name;
    int age;

    static String info = "我是一个人";

    public void eat(){
        System.out.println("eat");
    }

    public Person(){}

    //非静态代码块
    {
        System.out.println("非静态代码块2");
    }

    {
        System.out.println("非静态代码块1");
        age = 1;
    }


    //静态代码块
    static{
        System.out.println("静态代码块2");
    }

    static{
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
    }


}
