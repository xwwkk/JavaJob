package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest2
 * Package: com.atguigu09.inner
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 25/12/2024 下午3:00
 */
public class OuterClassTest2 {
    public static void main(String[] args) {
        SubA a = new SubA();
        a.method();

        A a1 = new A(){
            public void method(){
                System.out.println("method");
            }
        };

        a1.method();

        new A(){
            public void method(){
                System.out.println("method");
            }
        }.method();

        B b1 = new B(){
            public void method1(){
                System.out.println("method1");
            }
        };

        b1.method1();
        System.out.println(b1.getClass());
        System.out.println(b1.getClass().getSuperclass());

        new B(){
            public void method1(){
                System.out.println("method1");
            }
        }.method1();
    }
}

interface A{
    public void method();
}

class SubA implements A{

    @Override
    public void method() {

    }
}

abstract class B{
    public abstract void method1();
}