package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer3
 * Package: com.atguigu1.one.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午3:33
 */
public class ArrayExer3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter number of students: ");
        number = sc.nextInt();

        int[] grade = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grade[i] = sc.nextInt();
        }

        int max = grade[0];
        for (int i = 1; i < number; i++) {
            if (grade[i] > max) {
                max = grade[i];
            }
        }
        System.out.println("Max grade is " + max);

        char[] rate = new char[number];

        for (int i = 0; i < number; i++) {
            if (max - grade[i] < 10) {
                rate[i] = 'A';
            } else if (max - grade[i] < 20) {
                rate[i] = 'B';
            } else if (max - grade[i] < 30) {
                rate[i] = 'C';
            } else {
                rate[i] = 'D';
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("student " + (i + 1) + " grade: " + grade[i] + " rate： " + rate[i]);
        }
    }
}

