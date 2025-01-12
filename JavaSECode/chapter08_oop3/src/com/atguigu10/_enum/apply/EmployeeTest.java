package com.atguigu10._enum.apply;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu10._enum.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 26/12/2024 上午11:58
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Tom",18,Status.BUSY);

        System.out.println(e1.toString());
    }
}
