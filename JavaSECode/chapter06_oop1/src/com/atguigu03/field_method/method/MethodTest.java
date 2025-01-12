package com.atguigu03.field_method.method;

/**
 * ClassName: MethodTest
 * Package: com.atguigu03.field_method.method
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 16/12/2024 下午3:52
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sleep(1);
    }
}

class Person{
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少睡" + hour);
    }

    public String hobbies(String hobby){
        String info = "我的爱好是" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge(){
        return age;
    }
}
