package com.kh.oop.constructorPre;

import java.util.Scanner;

public class CafeRun {

    //Scanner 이용해서 주문받고 주문 받은 내용을 출력하는 기능 생성

    // 1. main()메서드 생성

    // 2. main()메서드 안에 Scanner 활용

    //3. Scanner로 작성한 입력 값을 모두 받아
    //필수 생성자로 만들어진 객체에 변수명으로 저장

    //4. 주문 출력


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴 이름을 입력하세요 : ");
        String menuName = sc.nextLine();

        System.out.print("가격을 입력하세요 : ");
        int price = sc.nextInt();

        System.out.print("수량을 입력하세요 : ");
        int quantity = sc.nextInt();



        Cafe c = new Cafe(menuName, price, quantity);/**/
        System.out.println(c.totalprice(price, quantity));
        System.out.println(c.toString());
        /*System.out.println("주문한 메뉴 : " + menuName + ", 주문 수량 : " + quantity + "결제 금액 : " + totalPrice);
        int totalPrice = price * quantity;*/
    }


}
