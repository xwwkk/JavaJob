package com.atguigu08._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.atguigu08._interface.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午10:52
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(){}

    public ComparableCircle(double radius){
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else if(this.getRadius() < c.getRadius()){
//                return -1;
//            }else{
//                return 0;
//            }

            return Double.compare(this.getRadius(), c.getRadius());
        }else {
            throw new RuntimeException("你输入的类型不匹配");
        }
    }
}
