package com.atguigu03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午3:03
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1);
        e1.id = 1;
        e1.name = "xiaomi";
        e1.age = 18;
        e1.salary = 10000;
        Employee e2 = new Employee();
        e2.id = 2;
        e2.name = "xiaohong";
        e2.age = 19;
        e2.salary = 2000;

        System.out.println("id = " + e1.id + "name = " + e1.name + " age = " + e1.age + " salary = " + e1.salary);
        System.out.println("id = " + e2.id + "name = " + e2.name + " age = " + e2.age + " salary = " + e2.salary);
    }
}
