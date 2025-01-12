package com.atguigu10._enum;

/**
 * ClassName: SeasonTest1
 * Package: com.atguigu10._enum
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 25/12/2024 下午3:24
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        //1.toString()
        System.out.println(Season1.SPRING);
        //2.name()
        System.out.println(Season1.SPRING.name());
        //3.values()
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }
        //4.valueOf()获得枚举类中名称为WINTER的对象，如果不存在，则报错
        String objName = "WINTER";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        //5.ordinal
        System.out.println(Season1.SPRING.ordinal());

        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SUMMER.getClass().getSuperclass());
        System.out.println(Season1.SUMMER.getClass().getSuperclass().getSuperclass());

        Season1.SPRING.show();
    }
}

interface Info{
    void show();
}

enum Season1 implements Info{
    //必须在枚举类的开头声明多个对象，对象之间用,隔开
    SPRING("Spring", "Spring flower"){
        @Override
        public void show() {
            System.out.println("spring");
        }
    },
    SUMMER("Summer", "Summer sun"){
        @Override
        public void show() {
            System.out.println("summer");
        }
    },
    WINTER("Winter", "Winter snow"){
        @Override
        public void show() {
            System.out.println("winter");
        }
    },
    AUTUMN("Autumn", "Autumn leaf"){
        @Override
        public void show() {
            System.out.println("autumn");
        }
    };

    //实例变量用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //私有化构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //提供get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}