package com.kh.oop.constructor;

public class Snack {
    /*
    * snackRun에
    * sr1 sr2 sr3
    * 1. 기본생성자
    * 초코칩 쿠키 1500원 달콤한 초코맛
    * 허니버터칩 2000원 달콤한 버터맛
    *
    * 2. 매개변수 ALL 생성자
    * 새우깡 1200원 짭짤한 새우맛
    *
    * 과자 정보 toString 출력
    * */

    //필드
    private String name;
    private int price;
    private String Taste;

    //기본생성자
    public Snack() {

    }

    //필수생성자
    public Snack(String name, int price, String Taste) {
        this.name = name;
        this.price = price;
        this.Taste = Taste;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTaste(String taste) {
        Taste = taste;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getTaste() {
        return Taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", Taste='" + Taste + '\'' +
                '}';
    }
}
