package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer2
 * Package: com.atguigu1.one.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午3:28
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        String[] weeks = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number of weeks: ");
            int n = sc.nextInt();

            if (n > 0 && n < 7) {
                System.out.println(weeks[n - 1]);
                break;
            }else{
                System.out.println("Invalid input");
            }
        }while(true);

        sc.close();
    }
}


