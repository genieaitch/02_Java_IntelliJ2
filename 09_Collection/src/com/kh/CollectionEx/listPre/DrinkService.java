package com.kh.CollectionEx.listPre;

import java.util.ArrayList;

public class DrinkService {
    //1. Drink 객체 생성 d
    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    //2. Drink 음료 이름 가격 추가

    public void addDrink(String name, int price) {
        Drink d = new Drink(name, price);
        drinks.add(d);
        System.out.println(name + "이(가) 추가되었습니다.");
    }

    //3. Drink 음료 이름 가격 모두 조회
    public void allDrinks() {
        if (drinks.size() > 0) {
            System.out.println("등록된 메뉴가 없습니다.");
        } else {
            System.out.println("--- 모든 음료 목록 ---");
            for (int i = 0; i < drinks.size(); i++) {
                System.out.println(drinks.get(i));
            }
        }
    }

    //4. Drink 음료 특정 음료 삭제
    public void removeDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).equals(name)) {//우리가 검색한 음료 이름과 목록에 있는 이름이 일치하다면
                drinks.remove(i);
                System.out.println("음료를 삭제했습니다.");
            }
        }

    }

    //5. Drink 음료 특정 음료 검색
    public void searchDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).equals(name)) {//우리가 검색하고자하는 음료 이름이 있다면
                System.out.println(drinks.get(i)); //음료 정보 출력하기
            } else{
                System.out.println("상품명과 일치하는 음료가 없습니다.");
            }
        }
    }

    //6. Drink 음료 특정 음료 검색 → 가격을 통해 검색
    public void searchDrink(int price) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).equals(String.valueOf(price))) {//우리가 검색하고자 하는 음료 가격이 있다면
                System.out.println(drinks.get(i)); //가격에 맞는 음료 정보를 출력
            } else{
                System.out.println("가격이 일치하는 음료가 없습니다.");
            }
        }
    }
}

