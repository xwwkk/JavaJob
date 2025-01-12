package com.atguigu08.constructor.exer1;

/**
 * ClassName: Studetn
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午1:17
 */
public class Student {
    String name;
    int age;
    String school;
    String major;

    public Student(String n, int a){
        name = n;
        age = a;
    }

    public Student(String n, int a, String s){
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m){
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo(){
        return name + " " + age + " " + school + " " + major;
    }
}
