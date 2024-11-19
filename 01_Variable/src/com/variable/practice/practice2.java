/*11/18 방과후과제2*/
package com.variable.practice;

import java.util.Scanner;

// 자동정렬 단축키 → Ctrl + Alt + L
// 한줄복사 단축키 → Ctrl + D

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //점수 입력(어떤걸 입력하는지 먼저 적어줘야함)
        System.out.print("국어 점수를 입력하세요 : ");
        double korean = sc.nextDouble();//실수는 double

        System.out.print("영어 점수를 입력하세요 : ");
        double english = sc.nextDouble();

        System.out.print("수학 점수를 입력하세요 : ");
        double math = sc.nextDouble();

        //(  ) 우선순위 진행
        int 총점 = (int) (korean+english+math);//국어+영어+수학 다음에 강제형변환 진행
        int 평균 = 총점 / 3;

        System.out.println("======성적결과=====");
        System.out.println("총점 : " + 총점);
        System.out.println("평균 : " + 평균);
    }
}
