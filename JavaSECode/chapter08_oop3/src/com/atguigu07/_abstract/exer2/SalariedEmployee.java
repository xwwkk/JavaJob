package com.atguigu07._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午9:10
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(){

    }

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earning() {
        return monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee [" + super.toString() + "]";
    }
}
