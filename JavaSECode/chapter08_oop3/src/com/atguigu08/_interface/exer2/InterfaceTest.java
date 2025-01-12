package com.atguigu08._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:59
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(2.1);

        int compareValue = c1.compareTo(c2);

        if(compareValue == 0){
            System.out.println("c1=c2");
        }else if(compareValue < 0){
            System.out.println("c1<c2");
        }else{
            System.out.println("c1>c2");
        }
    }
}
