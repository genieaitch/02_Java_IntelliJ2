package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
    private ArrayList<Clothing> clothingList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //옷 추가 기능
    public void addClothing() {

        System.out.print("옷이름 : ");
        String name = sc.nextLine();

        System.out.print("카테고리(상의/하의/외투 등) : ");
        String category = sc.nextLine();

        System.out.print("가격 : ");
        int price = sc.nextInt();

        Clothing c = new Clothing(name, category, price);

        clothingList.add(c);

        System.out.println("[" + name + "] 추가 완료!");
    }

    //추가된 옷 리스트들 확인하는 기능
    public void allClothing() {

        ArrayList<Clothing> clothing = new ArrayList<Clothing>();

        System.out.println("\n===추가된 옷 목록===");
        //하나씩 c라는 변수명에 옷이름 카테고리 가격을 담아서 보여주겠다

        if (clothingList.isEmpty()) {
            System.out.println("등록된 옷이 없습니다.");
        } else {
            for (Clothing c : clothingList) {//clothingList에 담겨있는 옷들을
                System.out.println(c);
            }
        }
    }
}
