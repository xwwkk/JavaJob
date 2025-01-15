package com.atguigu12.wrapper.exer1;

import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.atguigu12.wrapper.exer1
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 04:47
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner sc = new Scanner(System.in);

        int max = 0;

        while(true){
            System.out.println("请输入学生成绩：");
            int score = sc.nextInt();
            if(score < 0){
                break;
            }else{
                v.addElement(score);
                if(score > max){
                    max = score;
                }
            }
        }

        System.out.println("最高分：" + max);

        for (int i = 0; i < v.size(); i++) {
            Object objScore = v.elementAt(i);
            int score = (Integer)objScore;
            char grade = ' ';
            if(max - score <=10){
                grade = 'A';
            }else if(max - score<=20){
                grade = 'B';
            }else if(max - score<=30){
                grade = 'C';
            }else{
                grade = 'D';
            }

            System.out.println("student"+i+" score:"+score+" grade:"+grade);
        }
    }
}
