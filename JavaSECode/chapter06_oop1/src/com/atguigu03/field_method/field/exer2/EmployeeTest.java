package com.atguigu03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Package: com.atguigu03.field_method.field.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午3:14
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "jack";
        emp1.age = 18;
        emp1.salary = 10000;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 2006;
        emp1.birthday.month = 12;
        emp1.birthday.day = 7;

        System.out.println(emp1.birthday);

        System.out.println("id = " + emp1.id + " name = " + emp1.name + " age = " + emp1.age + " salary = " + emp1.salary + " birthday = " + emp1.birthday.year + "/" + emp1.birthday.month + "/" + emp1.birthday.day);
    }
}
