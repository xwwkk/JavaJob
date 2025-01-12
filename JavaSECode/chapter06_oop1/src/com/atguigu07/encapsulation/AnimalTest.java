package com.atguigu07.encapsulation;

/**
 * ClassName: AnimalTest
 * Package: com.atguigu07.encapsulation
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 下午2:08
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "金蟾";
        animal.setlegs(1);

        System.out.println(animal.getLegs());
        animal.eat();
    }
}

class Animal {
    String name;
     private int legs;

    public void setlegs(int legs) {
        if(legs > 0 & legs % 2 == 0){
            legs = legs;
        }else{
            System.out.println("wrong legs");
        }
    }

    public int getLegs(){
        return legs;
    }

    public void eat() {
        System.out.println("eat");
    }
}