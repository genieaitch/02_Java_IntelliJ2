package kh.com.ex;

import java.util.Scanner;

/*
 * 사칙연산 기능만 들어있는 클래스
 *
 * */
public class OperatorEx {

    // 줄 위치 변경 단축기 Alt + Shift + 화살표 위/ 아래 버튼

    /*
    * public static void main(String[] args) {}
    * 최종으로 출력하는 메인 기능에 내가 원하는 기능만 묶어서 출력하고자 할 때 작성하는 기능
    *
    * public void 기능명칭(){}
    * 각 원하는 기능별로 묶어서 main 기능에서 출력하고자 하는 기능만 선택해서 출력
    * */

    //맨 첫글자는 변수, 메서드명, 클래스명 모두 다 숫자를 넣을 수 없음
    public static void 삼의배수기능() {
        /*입력 받은 정수가 3의 배수가 맞는지 확인*/

        //Scanner 생성 import java.uitl.Scanner;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력하세요.");
        int a = sc.nextInt();

        /*
        * == (Equal to, 같음)
        * 부등호를 기준으로 좌 우에 있는 값이 같은지 다른지
        * 같으면 true 다르면 false
        *
        * != (Not Equal to, 다름)
        * 부등호를 기준으로 좌 우에 있는 값이 다른 값을 가지는 게 맞는지
        *
        * int a = 5;
        * int b = 5;
        * int c = 10;
        *
        * a == b true
        * a == c false
        *
        * a != c true      a와 c의 값이 다르기 때문에 true
        * a != b false     a와 숫자 5의 값이 같기 떄문에 false
        */

        boolean tf = a % 3 == 0; // boolean 3의 배수가 맞으면 true    3의 배수가 아니면 false
        System.out.println("입력한 숫자는 3의 배수인가 : " + tf);
    }

    public static void 이의배수기능(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int b = sc.nextInt();
        // 2의 배수가 맞으면 true 아니면 false
        boolean tf = b % 2 == 0;
        System.out.println("2의 배수인가 : "+tf);
    }
}
