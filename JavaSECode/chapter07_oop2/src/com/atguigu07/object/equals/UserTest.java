package com.atguigu07.object.equals;

import java.util.Objects;

/**
 * ClassName: UserTest
 * Package: com.atguigu07.object.equals
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 21/12/2024 下午9:39
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);

        System.out.println(u1.equals(u2));

        String s1 = "Tom";
        String s2 = "Tom";

        System.out.println(s1.equals(s2));

    }
}

class User{
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//
//        if(obj instanceof User){
//            User u = (User) obj;
////            if(this.age == u.age && this.name.equals(u.name)){
////                return true;
////            }else{
////                return false;
////            }
//            return this.name.equals(u.getName()) && this.age == u.getAge();
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}

