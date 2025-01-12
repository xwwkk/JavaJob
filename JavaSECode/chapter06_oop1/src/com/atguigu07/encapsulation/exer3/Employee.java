package com.atguigu07.encapsulation.exer3;

/**
 * ClassName: Employee
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:06
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String showInfo(){
        return  name + "\t " + gender + "\t" + age + "\t" + phoneNumber;
    }
}
