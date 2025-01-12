package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest1
 * Package: com.atguigu09.inner
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 25/12/2024 下午2:20
 */
public class OuterClassTest1 {
    public void method1(){
        //局部内部类
        class A{

        }
    }

    //开发中的场景
    public Comparable getInstance(){
        //提高了实现了Comparable的接口的类
        //方式一
//        class MyComparable implements Comparable<MyComparable>{
//
//            @Override
//            public int compareTo(MyComparable o) {
//                return 0;
//            }
//        }
//        return new MyComparable();
//
        //方式二
        return new Comparable(){

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
