package com.kh.oop.constructorPre;
//03_0_필드 실습 예제 1번
public class Product {
    //필드
    private String pName = "제품명";
    private int price = 1500;
    private String brand = "가나다라맑은세상";

    //기본생성자
    public Product() {
    }

    //void 메서드
    public void information(){
        System.out.println("이름 : " + pName);
        System.out.println("가격 : " + price);
        System.out.println("브랜드 : " + brand);
    }
}