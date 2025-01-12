package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 下午2:34
 */
public class Person {
    private int age;

    public void setAge(int age){
        if(age >= 0 && age <= 130){
            this.age = age;
        }else{
            System.out.println("输入非法");
        }
    }

    public int getAge(){
        return age;
    }
}
