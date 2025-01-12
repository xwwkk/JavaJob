package com.atguigu06.package_import;

import com.atguigu05.method_more._04recursion.RecursionTest;
import com.atguigu05.method_more._04recursion.exer2.RabbitExer;

import java.lang.reflect.Field;
import java.util.*;

/**
 * ClassName: PackageImportTest
 * Package: com.atguigu06.package_import
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 18/12/2024 下午1:49
 */
public class PackageImportTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set  = new HashSet();

        Field field;

        RecursionTest test1 = new RecursionTest();

        RabbitExer test2 = new RabbitExer();

        Date date1 = null;

        java.sql.Date date2 = null;
    }
}
