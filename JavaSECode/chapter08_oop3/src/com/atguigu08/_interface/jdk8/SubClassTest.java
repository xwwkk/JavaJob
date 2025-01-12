package com.atguigu08._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Package: com.atguigu08._interface.jdk8
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 24/12/2024 下午4:34
 */
public class SubClassTest {
    public static void main(String[] args) {
        //知识点1：接口中声明的静态方法只能被接口调用
        CompareA.method1();

        //知识点2：接口中声明的默认方法可以被实现类继承，被实例调用
        SubClass s1 = new SubClass();

        //知识点3：类实现了两个接口，而两个接口中定义了同名同参的默认方法，会有接口冲突，要求实现类必须重写该方法
        s1.method2();

        //知识点4：子类继承了父类，实现了接口，父类和接口中有同名同参的方法，子类如果没有重写，则调用的是父类的方法
        s1.method3();

        s1.method();
    }
}
