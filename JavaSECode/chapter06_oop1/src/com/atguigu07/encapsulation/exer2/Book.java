package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: Book
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 19/12/2024 上午12:01
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String showInfo() {
        return "Book Name: " + bookName + " Author: " + author + " Price: " + price;
    }
}
