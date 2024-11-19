package com.kh.loof;

import java.util.Scanner;

public class LoofEx2 {
    Scanner sc = new Scanner(System.in);

    //while 문을 이용해서 while문이 false가 될 때까지 계속 실행
    /*
     * while문
     * 반복문의 한 종류로 특정 조건이 참(true)인 동안 계속해서 코드를 실행
     * 특정 조건이 거짓(false)인 경우 반복을 종료
     * while(조건식) {
     * 조건식이 true일 때 실행되는 코드}
     * */

    //while1 기능(메서드)은 i값이 6이 되면 false가 되는 기능
    public void While1() {
        int i = 1; //초기값
        while (i <= 5) {
            //i값이 1~5까지 일때만 실행되는 공간
            System.out.println(i); //출력이 되지만 i값이 무조건 1이기 때문에 무한 반복이 발생
            i++; // i값을 1씩 증가 i = i + 1;
        }
    }

    public void While2() {
        boolean xyz = true; //초기 xyz 값은 true

        while (xyz) { //xyz가 true일 동안 계속 실행하기
            System.out.println("현재값 xyz:" + xyz);
            System.out.print("xyz의 값을 false로 변경하려면 'no를 입력하세요.");
            String input = sc.nextLine(); //사용자의 입력값 받기

            //equalsIgnoreCase : 대소문자를 구분하지 않고 문자열을 비교하는 기능
            if (input.equalsIgnoreCase("no")) {
                xyz = false;
            }

/*
            if(input.equals("no")){//input으로 입력한 값이 no와 일치하다면 ==대신 .equals로 알려줌
                xyz = false;
            } else if(input.equals("NO")){
                xyz = false;
            } else if(input.equals("No")){
                xyz = false;
            } else if(input.equals("nO")){
                xyz = false;
            }*/
        }
        System.out.println("xyz가 false로 설정되어 반복이 종료되었습니다.");
    }

    //while3 기능(메서드)는 input의 값이 0이 되면 종료
    public void While3() {
        System.out.println("====0이 되면 종료되는 세상");
        int input = -1; //초기 값을 0이 아닌 아무 숫자나 설정

        while (input != 0) {
            System.out.print("숫자를 입력하세요(0을 입력하면 종료 : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }
        System.out.println("프로그램을 종료합니다.");
    }

    //while 기능(메서드)는 abc의 값이 -이 되면 종료
    public void While4() {
        System.out.println("===음수값을 적으면 종료===");
        int abc = 1; //음수가 아닌 아무값 초기로 설정

        while (abc > 0) {
            System.out.print("숫자를 입력해 주세요. : ");
            abc = sc.nextInt();
            System.out.println("입력된 숫자 : " + abc);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
