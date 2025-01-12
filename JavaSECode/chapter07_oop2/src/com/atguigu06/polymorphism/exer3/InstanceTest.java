package com.atguigu06.polymorphism.exer3;

/**
 * ClassName: InstanceTest
 * Package: com.atguigu06.polymorphism.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 上午12:06
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest test = new InstanceTest();

        test.method(new Student());
    }

    public void method(Person e){
        System.out.println(e.getInfo());
        if(e instanceof Graduate){
            System.out.println("graduate");
            System.out.println("student");
            System.out.println("person");
        }else if(e instanceof Student){
            System.out.println("student");
            System.out.println("person");
        }else if(e instanceof Person){
            System.out.println("person");
        }
    }
}

class Person {
    protected String name = "person";
    protected int age = 0;

    public String getInfo() {
        return "Name:" + name + ",Age:" + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name:" + name + ",Age:" + age + ",School:" + school;
    }
}

class Graduate extends Student {
    public String major = "IT";
    public String getInfo(){
        return "Name:" + name + ",Age:" + age + ",School:" + school + ",Major:" + major;
    }
}