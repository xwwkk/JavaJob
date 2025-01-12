package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 24/12/2024 下午4:33
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
    @Override
    public void method2() {
        System.out.println("override");
    }

    public void method3(){
        System.out.println("method3");
    }

    //知识点5：任何在子类中调用父类和接口类的方法
    public void method(){
        method3();
        super.method3();

        method2();

        CompareA.super.method2();

        CompareB.super.method2();
    }
}
