package com.atguigu09.inner;

/**
 * ClassName: OuterClassTest
 * Package: com.atguigu09.inner
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 24/12/2024 下午11:30
 */
public class OuterClassTest {
    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        dog.eat();

        Person p1 = new Person();
        Person.Bird bird = p1.new Bird();

        bird.eat();
        bird.show("形参");
        bird.show1();
    }
}

class Person{

    String name = "Tom";
    int age = 1;

    public void eat(){
        System.out.println("吃饭");
    }

    static class Dog{
        public void eat(){
            System.out.println("吃骨头");
        }
    }

    class Bird{
        String name = "啄木鸟";

        public void eat(){
            System.out.println("吃虫子");
        }

        public void show(String name){
            System.out.println(age);
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);
        }

        public void show1(){
            Person.this.eat();
            eat();
        }
    }

    public void method(){

        class InnerClass1{

        }
    }

    public Person(){

        class InnerClass1{

        }
    }

    {

        class InnerClass1{

        }
    }

    
}