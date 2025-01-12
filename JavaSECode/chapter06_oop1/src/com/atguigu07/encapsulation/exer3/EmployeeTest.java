package com.atguigu07.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu07.encapsulation.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:09
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < emps.length; i++) {
            emps[i] = new Employee();

            System.out.println("----------添加第" + (i+1) + "个员工");
            System.out.println("姓名：");
            emps[i].setName(sc.next());
            System.out.println("性别：");
            emps[i].setGender(sc.next().charAt(0));
            System.out.println("年龄：");
            emps[i].setAge(sc.nextInt());
            System.out.println("电话号码:");
            emps[i].setPhoneNumber(sc.next());
        }

        System.out.println("---------------员工列表--------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话");
        for (int i = 0; i < emps.length; i++) {
            System.out.println((i+1) + "\t" + emps[i].showInfo());
        }

    }
}
