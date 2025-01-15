package com.atguigu11.annotation;

import java.util.Date;

/**
 * ClassName: annotationTest
 * Package: com.atguigu11.annotation
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/14 20:12
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(2000,11,2);
        System.out.println(date1);

        Person p1 = new Person();
        Person p2 = new Person("Tom");
        System.out.println(p2);

        @SuppressWarnings("unused") int num = 10;
    }
}

@MyAnnotation("class")
class Person{
    @MyAnnotation
    String name;
    int age;

    public Person(){
    }

    @Deprecated
    public Person(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("Student eat");
    }
}
