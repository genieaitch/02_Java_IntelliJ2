package com.kh.pratice.condition;

import java.util.Scanner;

public class Practice1 {
    /*
     * 메소드명 : method1
     * */
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("=== 메뉴 ===");
        System.out.print("1. 입력");
        System.out.print("2. 수정");
        System.out.print("3. 조회");
        System.out.print("4. 삭제");
        System.out.print("5. 종료");
        System.out.print("메뉴 번호를 입력하세요.");

        //메뉴 번호 입력 받기
        int choice = sc.nextInt();

        String result;

        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                result = "잘못된 번호.";
                break;
        }
        System.out.println(result + "메뉴입니다.");
    }
    public void method2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요.");
        int num = sc.nextInt();

        if(num>0){
            if(num%2==0){
            System.out.println("짝수입니다.");
        } else{
            System.out.println("홀수입니다.");
        }
    } else {
            System.out.println("양수가 아닙니다.");
        }
    }
/*

        //아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
        //로그인 성공 시 "로그인 성공"
        //아이디가 틀렸을 경우 "아이디가 틀렸습니다."
        //비밀번호가 틀렸을 경우 "비밀번호가 틀렸습니다." 출력
        //아이디 : myId 비밀번호 : myPassword12 모두 입력해야 로그인 성공
    public void method3(){

        String saveId = "myId";
        String savePw = "myPassword12";

        Scanner sc1 = new Scanner(System.in);
            System.out.print("아이디를 입력해주세요 : ");
            int inputId = sc1.nextLine();
            System.out.print("비밀번호를 입력해주세요 : ");
            int inputPw = sc1.nextLine();

            if(inputId.equals(saveId)){
                System.out.println("아이디가 일치합니다.");
            }
            if

            if(saveId == inputId && savePw ==  inputPw){
                System.out.println("로그인 성공");
            } else if(saveId != inputId){
        System.out.println("아이디가 틀렸습니다");
            }
            else if (savePw != inutPw) {
                System.out.println("비밀번호가 틀렸습니다.");
            } else
        System.out.println("아이디와 비밀번호가 틀렸습니다.");
        }*/
}
