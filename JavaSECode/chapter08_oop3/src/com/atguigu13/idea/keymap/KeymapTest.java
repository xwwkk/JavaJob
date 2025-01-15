package com.atguigu13.idea.keymap;

import org.testng.annotations.Test;

/**
 * ClassName: KeymapTest
 * Package: com.atguigu13.idea.keymap
 * Description:
 *
 * @Author Kevin
 * @Create 2025/1/15 05:22
 * @Version 1.0
 */
public class KeymapTest {
    @Test
    public void test() {
        final int NUM = 1;

        String s = new String();

        method();
    }

    private static void method() {
        for (int i = 0; i < 100; i++) {
            Object nb = new Object();
            String str1 = (String) nb;
        }
    }

    class Person{
        public void eat(){};
    }

    interface A{
        void method1();
    }

    class Student extends Person implements A{
        @Override
        public void eat() {
            super.eat();
        }

        @Override
        public void method1() {

        }
    }
}

