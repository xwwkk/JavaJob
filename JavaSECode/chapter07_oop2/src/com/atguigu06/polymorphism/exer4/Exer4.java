package com.atguigu06.polymorphism.exer4;

/**
 * ClassName: Exer4
 * Package: com.atguigu06.polymorphism.exer4
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 上午12:20
 */
public class Exer4 {

    public static void main(String[] args) {
        Exer4 exer4 = new Exer4();
        exer4.meeting(new Man(),new Woman());
    }

    public static void meeting(Person ... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();

            if(ps[i] instanceof Man){
                Man man = (Man) ps[i];
                man.smoke();
            }else if(ps[i] instanceof Woman){
                Woman woman = (Woman) ps[i];
                woman.makeup();
            }
            System.out.println();
        }
    }
}

