package com.kh.CollectionEx.list.library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private ArrayList<Book> books = new ArrayList<>();

    public void insertBook(String title, String author, String pages, int price) {
        Book b = new Book(title, author, pages, price);
        books.add(b);
        System.out.println(title + "추가되었습니다.");
    }

    public void selectList() {
        if (books.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
        } else {
            for (Book b : books)
                System.out.println(b);
        }
    }

    public void searchBook(String title) {
        ArrayList<Book> searchList = new ArrayList<>();
        for (Book b : books) {
            if (b.getTitle().contains(title)) {
                searchList.add(b);
            }
            ;
        }

        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다");
        } else {
            for (Book b : searchList) {
                System.out.println(b);
            }
        }
    }

        public void deleteBook (String title, String author) {
            for (Book book : books) {
                if (book.getTitle().equals(book.getAuthor())) {
                    books.remove(book);
                    System.out.println("성공적으로 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 도서를 찾지 못했습니다.");
                }
            }
        }
    }

