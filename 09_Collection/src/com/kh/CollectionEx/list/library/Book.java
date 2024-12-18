package com.kh.CollectionEx.list.library;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String pages;
    private int price;

    public Book() {
    }

    public Book(String title, String author, String pages, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "(" + title + "/" +author + "/" + pages + "/" + price + ")";
    }
}
