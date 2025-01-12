package com.atguigu01._static;

/**
 * ClassName: ChineseTest
 * Package: com.atguigu01._static
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午6:08
 */
public class ChineseTest {
    public static void main(String[] args) {
        System.out.println(Chinese.nation);
        Chinese.show();

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;

        Chinese c2 = new Chinese();
        c2.name = "刘翔";
        c2.age = 40;

        System.out.println(c1);
        System.out.println(c2);

        c1.nation = "CHN";
        System.out.println(c1.nation);
        System.out.println(c2.nation);
    }
}

class Chinese{
    static String nation;
    String name;
    int age;

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void show(){
        System.out.println("我是中国人");
    }
}
