package com.kh.loof;

import java.util.Scanner;

public class Menu {
    public void order() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===메뉴판===");
        System.out.println("메뉴를 선택해주세요(1~4)");
        System.out.print("1. 아메리카노 - 3000원");
        System.out.print("2. 라떼 - 4000원");
        System.out.print("3. 카푸치노 - 4500원");
        System.out.print("4. 주문종료");

        int menu = sc.nextInt();

        order(
                menu,
                System.out.println(menu + "를 선택하셨습니다.");
        );


    }
}
