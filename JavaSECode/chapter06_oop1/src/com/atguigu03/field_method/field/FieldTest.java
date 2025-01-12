package com.atguigu03.field_method.field;

/**
 * ClassName: FieldTest
 * Package: com.atguigu03.field_method.field
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午2:45
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name + "," + p1.age);
    }
}

class  Person{
    String name;
    int age;
    char gender;

    public void eat(){
        String food = "宫保鸡丁";
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour){
        System.out.println("人必须睡"+ hour + "小时");
    }
}

