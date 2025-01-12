package com.atguigu08._interface;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:04
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);

        Bullet b  = new Bullet();
        b.attack();
        b.fly();

        Attackable b1 = new Bullet();
        b1.attack();
    }
}

interface Flyable{
    //全局常量
    public static final int MIN_SPEED = 0;

    //可以省略public static final
    int MAX_SPEED = 7900;

    //方法可以省略public abstract
    void fly();
}

interface Attackable{
   void attack();
}

class Plane implements Flyable{
    public void fly() {
        System.out.println("Plane flying");
    }
}

class Bullet implements Flyable, Attackable{
    @Override
    public void attack() {
        System.out.println("Bullet attacking");
    }

    @Override
    public void fly() {
        System.out.println("Bullet flying");
    }
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

//证明接口可以多继承
interface CC extends AA, BB{}

class DD implements CC{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}