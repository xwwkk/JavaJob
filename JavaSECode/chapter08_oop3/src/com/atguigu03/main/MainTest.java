package com.atguigu03.main;

/**
 * ClassName: MainTest
 * Package: com.atguigu03.main
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 22/12/2024 下午8:45
 */
public class MainTest {
    public static void main(String[] args) {
        String[] arr = new String[]{"aa", "bb", "cc"};
        Main.main(arr);

    }
}

class Main{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
