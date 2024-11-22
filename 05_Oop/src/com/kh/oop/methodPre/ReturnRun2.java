package com.kh.oop.methodPre;

public class ReturnRun2 {
    public static void main(String[] args) {

        ReturnPre2 pre = new ReturnPre2();

        pre.method1("홍길동", 40);
        System.out.println("method 1번 출력확인 : " );

        pre.method2(123, 456);
        System.out.println("method2 2번 출력확인 : " + pre.method2(123, 456));

        System.out.println("===등급 확인===");
        pre.method3();
        System.out.println("===할인된 금액 확인===");
        pre.method4(100000,20);
        System.out.println("===배열 평균값 반환===");
        pre.method5();
        System.out.println("===성인 확인===");
        pre.method6(17);
        System.out.println("===문자 연결===");
        pre.method7();
        System.out.println("===과일 찾기===");
        //pre.method8("apple","banana");
        System.out.println("===원 넓이 확인===");
        pre.method9();
    }
}
