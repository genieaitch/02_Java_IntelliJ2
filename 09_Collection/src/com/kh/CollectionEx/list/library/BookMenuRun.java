package com.kh.CollectionEx.list.library;

import java.util.Scanner;

public class BookMenuRun {
    public static void main(String[] args) {
        BookMenu bookMenu = new BookMenu();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== Welcome KH Library ==");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("번호를 입력하세요 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("도서명 : ");
                    String title = scanner.nextLine();
                    System.out.print("저자명 : ");
                    String author = scanner.nextLine();
                    System.out.print("장르 (1.인문/ 2.자연과학/ 3.의료/ 4.기타) : ");
                    int pages = scanner.nextInt();
                    scanner.nextLine();

                    String genre = "";
                    switch (pages) {
                        case 1:
                            genre ="인문";
                            break;
                        case 2:
                            genre="자연과학";
                            break;
                        case 3:
                            genre="의료";
                            break;
                        case 4:
                            genre="기타";
                            break;
                        default:
                            System.out.print("번호로 입력해주세요");
                            genre="기타";
                    }

                        System.out.print("가격 : ");
                        int price = scanner.nextInt();
                        bookMenu.insertBook(title, author, genre, price);
                        break;
                        case 2:
                            bookMenu.selectList();
                            break;
                        case 3:
                            bookMenu.searchBook();
                            break;
                        case 4:
                            bookMenu.deleteBook();
                            break;
                        case 9:
                            System.out.println("프로그램을 종료합니다.");
                            return;
                        default:
                            System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
                            break;
                    }

            }
        }
    }
