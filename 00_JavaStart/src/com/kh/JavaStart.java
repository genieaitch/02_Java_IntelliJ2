package com.kh;
/*
 * 범위 주석(초록색 주석) = 문자로 작성한 설명을 작성
 */
/**
 * 범위 주석(파란색 주석) = 클래스/ 메서드 설명용 주석(html 방식으로 작성 많이함)
 *
 * main 메서드
 * <p>
 * 자바 프로그램을 실행시키기 위해서는 반드시 필요한 기능(구문)
 * </p>
 * */
// : 한줄 주석
// 주석 : 컴파일러가 해석하지 않는 구문 → 코드 설명 작성 시 주로 사용

/*
 * html에서는 <!DOCTYPE html> 작성 후 <html>로 코딩을 작성하는 공간 설정
 * java에서는 public class 파일명 {      } 안에 코딩 작성하는 공간 설정
 *
 * class : -자바 코드를 작성하는 영역을 나타내는 표기
 */

//공공의  파일명  파일명{         }
public class JavaStart {
    //자바 코드 실행 방법
    // 1) 위에 Run버튼( 재생 버튼 처럼 생긴 것) 클릭
    // 2) 실행 단축기 : ctrl + f11
    public static void main(String[] args) {

        // System.out.println(); → ()안에 문자열을 console에 출력 후 줄바꿈하는 기능
        // System.out.print(); → ()안에 문자열을 console에 출력 후 줄바꿈을 하지 않고 옆으로 이어 붙여져 출력하는 기능

        // Java에서는 ''와 ""의 차이가 명확하기 때문에
        // System.out.println(); 안에서는 무조건 문자열을 감쌀 때 "" 사용

        /*
         * '' ""차이
         * "  " = 문자열(문자로 나열된 문자들), 문자열 표현할 때 사용 길이 제한 없음
         * '  ' = 문자, 한 글자씩 표현할 때 사용 길이 1문자(무조건 한 칸씩) 'a' 'A' '가' '각'
         */

        System.out.println("안녕하세요.");

        //syscout + ctrl + space 자동완성
        System.out.println("Java는 코드 끝에 꼭 세미콜론(;)을 붙여야합니다.");
        System.out.println("뒤에 세미콜론을 붙여주지 않으면 에러발생");

        //숫자 연산의 경우 +를 작성해줄 때 ""를 사용 안함
        System.out.println(200+500);

        //숫자와 문자를 이어 붙여주기
        System.out.println(200+50+"입니다");

        //사칙연산 우선순위 적용
        //먼저 연산하고 싶으면 소괄호()로 묶어준다
        System.out.println("합계 : " +(555+666)+" 원");


    }
}
