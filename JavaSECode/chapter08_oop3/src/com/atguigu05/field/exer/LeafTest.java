package com.atguigu05.field.exer;

/**
 * ClassName: LeafTest
 * Package: com.atguigu05.field.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午1:52
 */
public class LeafTest {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
    }
}

class Root{
    static{
        System.out.println("Root的静态初始化块");
    }

    {
        System.out.println("Root的普通初始化块");
    }

    public Root(){
        System.out.println("Root的构造器");
    }
}

class Mid extends Root{
    static{
        System.out.println("Mid的静态初始化块");
    }

    {
        System.out.println("Mid的普通初始化块");
    }

    public Mid(){
        System.out.println("Mid的构造器");
    }
}

class Leaf extends Mid{
    static{
        System.out.println("Leaf的静态初始化块");
    }

    {
        System.out.println("Leaf的普通初始化块");
    }

    public Leaf(){
        System.out.println("Leaf的构造器");
    }
}


