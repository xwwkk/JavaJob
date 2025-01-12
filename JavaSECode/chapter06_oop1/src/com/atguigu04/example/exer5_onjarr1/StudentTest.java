package com.atguigu04.example.exer5_onjarr1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午3:29
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[20];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].numeber = i;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }

//        System.out.println("id\tstate\tscore");
//        for (int i = 0; i < students.length; i++) {
//            if(students[i].state == 3){
//                //System.out.println(students[i].numeber + "\t" + students[i].state + "\t\t" + students[i].score);
//                System.out.println(students[i].info());
//            }
//        }
        StudentUtil util = new StudentUtil();
        util.printStudentsWithIndex(students,3);

//        for (int i = 0; i < students.length - 1; i++) {
//            for (int j = 0; j < students.length - 1 - i; j++){
//                if (students[j].score > students[j + 1].score){
//                    Student temp = students[j];
//                    students[j] = students[j+1];
//                    students[j+1] = temp;
//                }
//            }
//        }
        util.sortStudents(students);

        util.printStudents(students);
//        System.out.println("id\tstate\tscore");
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i].info());
//        }
    }
}
