package com.kh.CollectionEx.list.library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private ArrayList<Book> books = new ArrayList<>();

    public void insertBook(String title, String author, int pages, int price) {
        Book b = new Book(title, author, pages, price);
        books.add(b);
        System.out.println(title + "추가되었습니다.");
    }

    public void selectList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.addAll(books);
        if (books.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
        } else {
            System.out.println(bookList);
        }
    }

    public void searchBook() {
        Scanner scanner = new Scanner(System.in);
        int pages = scanner.nextInt();
        ArrayList<Book> searchList = new ArrayList<>();

        /*switch (pages) {
            case 1:
                System.out.println("인문");
                break;
            case 2:
                System.out.println("자연과학");
                break;
            case 3:
                System.out.println("의료");
                break;
            case 4:
                System.out.println("기타");
                break;
            default:
                System.out.println("번호로 입력해주세요");
                return;

        }*/
        if (books.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println(searchList);
        }
    }
    public void deleteBook(){
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
