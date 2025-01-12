package com.atguigu04.example.exer2;

/**
 * ClassName: Exer02
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午2:55
 */
public class Exer02 {
    public static void main(String[] args) {
        Exer02 exer =  new Exer02();

        exer.method1();
        int area = exer.method2();
        System.out.println(area);
        System.out.println(exer.method3(3,2));

    }

    public void method1(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int method2(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        return m * n;
    }
}
