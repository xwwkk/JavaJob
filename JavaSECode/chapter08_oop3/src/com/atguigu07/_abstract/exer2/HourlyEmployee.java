package com.atguigu07._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.atguigu07._abstract.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午9:12
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earning() {
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee [" + super.toString() + "]";
    }
}
