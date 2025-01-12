package com.atguigu08._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 24/12/2024 下午4:32
 */
public interface CompareA {
    //属性：声明为public static final
    //方法：声明为抽象方法

    public static void method1(){
        System.out.println("method1");
    }

    public default void method2(){
        System.out.println("method2A");
    }

    public default void method3(){
        System.out.println("method3");
    }

    //jdk9
    private void method5(){
        System.out.println("我是接口中的私有方法");
    }
}
