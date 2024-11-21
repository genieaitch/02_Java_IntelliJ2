package com.kh.oop.methodPre;

public class VoidPre {
    //기능  1: 온도 변환기
    public void method1(double celsius){
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨" + celsius + "도는 화씨" + fahrenheit + "도 입니다");
    }

    //기능   2: 학생 이름 출력
    public void method2(String name){
        System.out.println("학생 이름 : " + name);
    }

    //기능  3: 상품 가격 표시
    public void method3(String itemName, int price){
        System.out.println("상품명 : " + itemName + ", 가격 : " + price + "원");
    }

    //기능  4: 시간 계산
    public void method4(int hours, int minutes){
        int totalMinutes = hours * 60 + minutes;
        System.out.println("총 " + totalMinutes + "분입니다.");
    }

    //기능  5: 운동 기록 출력
    public void method5(String exercise, int duration){
        System.out.println("운동 : " + exercise + ", 지속 시간 : " + duration);
    }

    //기능  6: 계좌 잔액 출력
    //%s = String %d = int %.숫자f = 소수점표기 %n newLine 줄바꿈
    public void method6(String accountNumber, double balance){
        System.out.printf("계좌번호 : %s, 잔액 : %.2f원%n", accountNumber, balance);
    }

    /*↓ 밑에 바꿔보기*/
    //printf → %s = String %d = int %.숫자f = 소수점표기 %n newLine 줄바꿈

    //기능  7: 영화 정보 출력
    public void method7(String subject, String rating){
        System.out.println("영화제목" + subject + ", 평점 : " + rating);
    }

    //기능  8: 차량 정보 출력
    public void method8(String car, String topSpeed){
        System.out.println("차량명 : " + car + ", 최고 속도 : " + topSpeed);
    }

    //기능  9: 이메일 전송 로그
    public void method9(String recipient, String mailSubject){
        System.out.println("수신자 : " + recipient + ", 제목 : " + mailSubject );
    }

    //기능  10: 쇼핑카트 아이템 출력
    public void method10(String item, int quantity){
        System.out.println("상품명 : " + item + ", 수량 : " + quantity + "개");
    }
}
