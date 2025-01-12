package com.atguigu05._super.exer1;

/**
 * ClassName: Kids
 * Package: atguigu03._extends.exer1
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 下午9:51
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int sex, int salary, int yearsOld) {
       super(sex, salary);
       this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){
        System.out.println("Years old: " + yearsOld);
    }

    @Override
    public void employeed() {
        super.employeed();
        System.out.println("Kids should study and no job");
    }
}
