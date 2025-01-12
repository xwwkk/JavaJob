package com.atguigu10._enum;

/**
 * ClassName: SeasonTest
 * Package: com.atguigu10._enum
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 25/12/2024 下午3:16
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}

class Season{

    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public static final Season SPRING = new Season("Spring", "Spring flower");
    public static final Season SUMMER = new Season("Summer", "Summer sum");
    public static final Season WINTER = new Season("Winter", "Winter snow");
    public static final Season AUTUMN = new Season("Autumn", "Autumn leaf");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
