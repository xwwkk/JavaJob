package com.atguigu07._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午9:15
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("lb", 1001,
                new MyDate(1992, 12,21), 18000);

        emps[1] = new HourlyEmployee("cc", 1002,
                new MyDate(1998,12,1),100,160);

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入当前的月份：");
        int month = sc.nextInt();

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            if(emps[i].getBirthday().getMonth() == month){
                System.out.println("生日快乐");
                System.out.println("工资为： " + emps[i].earning() + 100);
            }else{
                System.out.println("工资为： " + emps[i].earning() + 100);
            }
        }
    }
}
