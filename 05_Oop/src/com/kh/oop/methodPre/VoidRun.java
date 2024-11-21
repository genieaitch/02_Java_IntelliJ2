package com.kh.oop.methodPre;

public class VoidRun {
    public static void main(String[] args) {
        VoidPre voidPro = new VoidPre();

        System.out.println("===온도 변환기===");
        voidPro.method1(25.0);

        System.out.println("===학생 이름 출력===");
        voidPro.method2("홍길동");

        System.out.println("===상품 가격 표시===");
        voidPro.method3("노트북", 1500000);

        System.out.println("===시간 계산===");
        voidPro.method4(2,30);

        System.out.println("===운동 기록 출력===");
        voidPro.method5("달리기", 45);

        System.out.println("===계좌 잔액 출력===");
        voidPro.method6("123-456-789", 100000.50);

        System.out.println("===영화 정보 출력===");
        voidPro.method7("인터스텔라", "9.5/10");

        System.out.println("===차량 정보 출력===");
        voidPro.method8("스포츠카", "300km/h");

        System.out.println("===이메일 전송 로그===");
        voidPro.method9("example@kht.com", "안녕하세요");

        System.out.println("===쇼핑카트 아이템 출력===");
        voidPro.method10("휴대폰 케이스", 2);
    }
}
