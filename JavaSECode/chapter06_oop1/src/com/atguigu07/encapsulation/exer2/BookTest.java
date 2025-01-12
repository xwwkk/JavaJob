package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:03
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBookName("兼职");
        book1.setAuthor("wudi");
        book1.setPrice(1900.999);

        System.out.println(book1.showInfo());
    }
}
