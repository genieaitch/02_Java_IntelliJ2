package com.kh.loof;

import java.util.Scanner;

public class LoofEx {
    //필드 = 변수명

    // 앞으로 만드는 public void 기능명(메서드 = method) {}
//                   public static void main(String[] args){}
    // 내부에서 SC를 사용할 수 있음!
    // 단! 한 파일 당 하나씩 외부 파일에서 변수를 사용할 때는 새로 선언해서 사용(Scanner sc = new Scanner(System.in);)
    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("숫자를 입력하세요.");
        int a = sc.nextInt();

        System.out.println("a값 확인하기 : " + a);

        /*1부터 10까지 출력하기 = for문을 활용해서*/
        for (int i = 0; i <= a; i++) {
            System.out.println("i의 값 : " + i);
        }
    }
    //class 중괄호 가장 바깥에 작성한 변수 = 전역 변수 = 필드(field)

    //class 안에서 Method 안에 작성한 변수 지역변수

    public void method2() {
        /*
         * method2 기능명칭 사용
         * 첫 번째 입력 받은 수부터 두 번째 입력 받은 수까지 1씩 증가하며 출력하기
         * 만약에 첫 번째 입력받은 값이 두 번째 입력받은 값보다 크다면 첫 번째 값은 두 번째 값보다 수가 작아야합니다. 출력
         * */
        System.out.println("숫자1은 숫자2보다 수가 적어야함");
        System.out.print("숫자 1 : ");
        int a = sc.nextInt();
        System.out.print("숫자 2 :");
        int b = sc.nextInt();
        System.out.println("a" + a + "의 값, b " + b + "값");

        if (a > b) {
            System.out.println("첫 번째 값은 두 번째 값보다 수가 작아야합니다.");
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                System.out.println("i의 값은 : " + i);
            }
        } else {
            System.out.println("두 값의 값이 동일합니다.");
        }
    }

    public void method3() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }

    public void method4() {
        /*method4두 수를 입력 받아서 반복 출력하는 구문을 작성
(첫 번째 입력 A, 두 번째 입력 B)
조건 1 : B가 A보다 큰 경우 -> A ~ B 까지 1씩 증가하며 출력
조건 2 : A가 B보다 큰 경우 -> A ~ B 까지 1씩 감소하며 출력
조건 3 : A와 B가 같다면 -> "같은 수 입력됨"*/

        System.out.println("두 가지 숫자를 입력해 주세요");
        System.out.print("숫자 A : ");
        int a = sc.nextInt();
        System.out.print("숫자 B : ");
        int b = sc.nextInt();

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println("증가값 : " + i);
            }
        }else if (a > b) {
                for (int i = a; i >= b; i--) {
                    System.out.println("감소값 :" + i);
                }
        }else {
            System.out.println("같은 값이 입력되었습니다.");
        }
    }
}


