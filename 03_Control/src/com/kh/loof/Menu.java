package com.kh.loof;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void order() {
        boolean is = true;
        int price = 0;

        System.out.println("===메뉴판===");
        System.out.print("1. 아메리카노 - 3000원");
        System.out.print("2. 라떼 - 4000원");
        System.out.print("3. 카푸치노 - 4500원");
        System.out.print("4. 주문종료");

        while (is) {
            System.out.println("메뉴를 선택해주세요(1~4) : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("아메리카노를 선택하셨습니다.");
                    price += 3000;
                    break;
                case 2:
                    System.out.println("라떼를 선택하셨습니다.");
                    price += 4000;
                    break;
                case 3:
                    System.out.println("카푸치노를 선택하셨습니다.");
                    price += 4500;
                    break;
                case 4:
                    System.out.println("주문을 종료합니다.");
                    is = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요");
                    break;

            }
            System.out.println("총 주문금액" + price +"원");
        }
    }
}
