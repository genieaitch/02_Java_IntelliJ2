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
    //3.리스트에 있는 옷들 중에서 삭제하고자 할 옷을 선택해서 제거하기
    //Book과 같이 제거하고자 하는 책제목을 Run에서 입력하는 것이 아니라 기능클래스에서 작성한 버전
    //결과는 같지만 결과에 도달하는 방법이 다름을 표현

    public void removeClothing() {
        System.out.println("\n===옷 제거===");
        System.out.print("제거하고자 하는 옷의 이름을 입력하세요 : ");
        String name = sc.nextLine();//제거하고자 하는 옷의 이름을 작성

        boolean found = false; //옷을 삭제했는지 확인하기 위한 변수, 현재는 아무것도 한 게 없기 때문에 false

        for(int i = 0; i < clothingList.size(); i++) {
            if (clothingList.get(i).getName().equals(name)) { //i번째 있는 옷에서 옷 이름과 삭제하고자 하는 옷 이름이 일치하다면
                clothingList.remove(i);// i번 째 있는 옷을 제거
                System.out.println("[" + name + "] 옷이 성공적으로 제거되었습니다.");
                found = true; // 찾았기 때문에 true
                break;
            }
        }
        //위 for 문 코드에서 만약에 삭제하고자 하는 옷 이름과 옷 목록리스트에 작서어된 옷 이름이 일치하다면 삭제를 한 상태

        //아래 if문 코드에서는 옷 이름을 검색했을 때 검색한 옷 이름이 없다면 옷을 찾을 수 없다라는 표기를 작성해줘야함
        if(!found) {
            System.out.println("[" + name + "] 옷을 찾을 수 없습니다.");
        }

    }
}

