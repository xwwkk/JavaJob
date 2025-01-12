package com.atguigu1.one;

/**
 * ClassName: OneArrayTest1
 * Package: com.atguigu1.one
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 15/12/2024 下午2:29
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        int[] i1 = new int[3];
        System.out.println(i1[0]);
        short[] s1 = new short[3];
        System.out.println(s1[0]);

        double[] dou1 = new double[3];
        System.out.println(dou1[0]);
        float[] f1 = new float[3];
        System.out.println(f1[0]);

        char[] c1 = new char[3];
        System.out.println(c1[0]);
        if(c1[0] == '\u0000'){
            System.out.println("yes");
        }

        boolean[] b1 = new boolean[3];
        System.out.println(b1[0]);

        String[] str1 = new String[3];
        System.out.println(str1[0]);

        System.out.println(str1);

        int[] a1 = new int[] {1,2,3};
        int[] a2 = a1;
        System.out.println(a1);
        System.out.println(a2);
    }
}
