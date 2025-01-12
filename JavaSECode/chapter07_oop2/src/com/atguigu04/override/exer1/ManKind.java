package com.atguigu04.override.exer1;

/**
 * ClassName: ManKind
 * Package: atguigu03._extends.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:48
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex == 1) {
            System.out.println("Man");
        }else if(sex ==0){
            System.out.println("Woman");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job！");
        }else{
            System.out.println("job!");
        }
    }
}
