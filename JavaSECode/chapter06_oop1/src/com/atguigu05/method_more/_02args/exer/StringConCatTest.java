package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConCatTest
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 17/12/2024 下午5:42
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-", "hello", "world");
        System.out.println(info);
        System.out.println(test.concat("/", "2000", "04", "05"));
    }

    public String concat(String operator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += operator + strs[i];
            }
        }
        return result;
    }
}
