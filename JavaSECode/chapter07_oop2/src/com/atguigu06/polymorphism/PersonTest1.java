package com.atguigu06.polymorphism;

/**
 * ClassName: PersonTest1
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:48
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 向下转型
        Man m1 = (Man) p1;
        m1.earn();
        m1.isSmoking = true;

        System.out.println(p1 == m1);

        /*
        建议在向下转型之前，适用instanceof进行判断
         */

        Person p2 = new Woman();

        if(p2 instanceof Man){
            Man w1 = (Man) p2;
            w1.earn();
        }

        if(p2 instanceof Woman){
            Woman w2 = (Woman) p2;
            w2.goShopping();
        }
    }
}
