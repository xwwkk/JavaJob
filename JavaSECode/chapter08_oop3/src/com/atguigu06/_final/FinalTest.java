package com.atguigu06._final;

/**
 * ClassName: FinalTest
 * Package: com.atguigu06._final
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午2:07
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);

        E e1 = new E(10);
        System.out.println(e1.LEFT);
    }
}

final class A{}

class C{
    public void method(){

    }
}

class D extends C{
    public void method(){

    }
}

class E{
    //成员变量
    final int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;

    {
        MAX_SCORE = 100;
    }

    public E(){
        LEFT = 2;
    }

    public E(int left) {
        LEFT = left;
    }
}

class F{
    public void method(){
        final int num;
        num = 10;
        System.out.println(num);
    }
}