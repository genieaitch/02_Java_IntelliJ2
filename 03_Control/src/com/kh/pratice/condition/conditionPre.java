package com.kh.pratice.condition;


import java.util.Scanner;

// switch case 문으로 나이를 입력받고 나이가 13세 이하 어린이, 18세 이하 청소년, 19세 이상 성인 출력
// 메서드명 = methodAge()
// 최종실행 ConditionPreRun 진행
public class conditionPre {
    public void methodAge() {
    Scanner sc = new Scanner(System.in);

     //나이 입력 안내문 + 작성공간
        System.out.print("나이를 입력해주세요: ");
        int a = sc.nextInt();

        switch (a / 10) {
            case 0: case 1:
                System.out.println("어린이 입니다.");
                break;
            case 2:
                if(a <=18) {
                    System.out.println("청소년입니다.");
                } else{
                    System.out.println("어른입니다.");
                }
                break;
            default:
                System.out.println("성인입니다.");
                break;
        }

    }
}
