package com.atguigu04.example.exer5_onjarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_onjarr1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午3:45
 */
public class StudentUtil {
    /*
    打印指定年纪的学生信息
     */
    public void printStudentsWithIndex(Student[] students, int state) {
        System.out.println("id\tstate\tscore");
        for (int i = 0; i < students.length; i++) {
            if(students[i].state == state){
                //System.out.println(students[i].numeber + "\t" + students[i].state + "\t\t" + students[i].score);
                System.out.println(students[i].info());
            }
        }
    }

    public void printStudents(Student[] students) {
        System.out.println("id\tstate\tscore");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].info());
        }
    }

    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++){
                if (students[j].score > students[j + 1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
