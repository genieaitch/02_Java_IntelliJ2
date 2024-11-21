package com.kh.oop.methodPre;

import java.util.Scanner;

public class ReturnPre2 {
    //1. 이름과 나이를 입력받아 소개 메시지 반환
    //안녕하세요! 제 이름은 홍길동이고, 나이는 40세 입니다.
    Scanner sc = new Scanner(System.in);

    public void method1(){
    System.out.print("이름을 입력해 주세요 : ");
        String name = sc.next();
    System.out.print("나이를 입력해 주세요 : ");
        int age = sc.nextInt();
    System.out.println("안녕하세요! 제 이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
    }

    //2. 두 숫자를 입력받아 가장 큰 숫자 반환 Scanner X
    //num1과 num2 비교해서 큰 값의 숫자를 출력
    //000보다 0000이 큰 숫자입니다.
    public void method2(){
        System.out.print("첫 번째 숫자를 입력해주세요(정수) : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요(정수) : ");
        int num2 = sc.nextInt();

        if(num1 != num2){
            if(num1 > num2){
                System.out.println(num2+"보다 "+num1+"이 더 큰 숫자입니다.");
            }
            if(num1 < num2){
                System.out.println(num1+"보다 "+num2+"이(가) 더 큰 숫자입니다.");
            }
        }
        /*if(num1 > num2){
        System.out.println(num2+"보다 "+num1+"이 더 큰 숫자입니다.");
        }else if(num1 < num2){
            System.out.println(num1+"보다 "+num2+"이(가) 더 큰 숫자입니다.");
        }else{
            System.out.println("같은 값입니다.");
        }*/
    }

    //3. 입력된 정수에 따라 등급 반환
    // 90 A 80 B 70 C 60 D 나머지 F char 이용
    public void method3(){
        System.out.print("점수를 입력해 주세요 : ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '9':
                System.out.println("등급 : A");
                break;
            case '8':
                System.out.println("등급 : B");
                break;
            case '7':
                System.out.println("등급 : C");
                break;
            case '6':
                System.out.println("등급 : D");
                break;
            case '5': case '4': case '3': case '2': case '1': case '0':
                System.out.println("등급 : F");
                break;
            default:
                break;
        }
    }

    //4. 상품 가격과 할인율을 입력받아 최종 금액 반환

    public void method4(){
        System.out.print("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();
        System.out.print("할인율을 입력하세요(숫자만) : ");
        int discount = sc.nextInt();
        
        int lastPrice = price-price*discount/100;
        
        System.out.println("원래 가격 : " + price + "할인율 : " + discount+"% 최종 금액 : "+ lastPrice+"원");
    }

    //5. 배열의 평균값 반환
    /*(향상된 for문과 +=문     sum / numbers.length 활용)
문제: 주어진 배열의 평균값을 아래와 같이 출력하세요.
출력 결과: 배열: [10, 20, 30, 40, 50] 평균값: 30.0*/
    public void method5(){
        int[] numbers = {10, 20, 30, 40, 50};
        double sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        double average = sum / numbers.length;

        System.out.println("배열 : ["+numbers+"] 평균값 : " + average);

    }
}
