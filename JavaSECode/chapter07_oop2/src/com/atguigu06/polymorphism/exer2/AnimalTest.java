package com.atguigu06.polymorphism.exer2;

/**
 * ClassName: AnimalTest
 * Package: com.atguigu06.polymorphism.apply
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 20/12/2024 下午2:29
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal){
        animal.eat();
        animal.jump();

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.guard();
        }else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchmouse();
        }
    }
}


