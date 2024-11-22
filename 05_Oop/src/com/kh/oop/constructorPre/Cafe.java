package com.kh.oop.constructorPre;

public class Cafe {
//필드
    //메뉴 이름
    //가격
    //주문수량

    private String menuName;
    private int price;
    private int quantity;

//메서드
    //1. 기본생성자
    //2. 필수생성자
    //3. Setter
    //4. Getter
    //5. 주문 총액 계산 price * quantity 전달
    //6. 주문 출력 toString @Override 사용해서 출력


    public Cafe() {
    }

    public Cafe(String menuName, int price, int quantity) {
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int totalprice(int price, int quantity) {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +'}';
    }
}
