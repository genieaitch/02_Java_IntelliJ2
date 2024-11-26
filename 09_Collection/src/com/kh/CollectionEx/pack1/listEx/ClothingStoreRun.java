package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        //1. Scanner 소환
        Scanner sc = new Scanner(System.in);
        //2. ClothingStore 소환

        ClothingStore cs = new ClothingStore();

        while (true) {
            System.out.println("\n ===옷 쇼핑몰 관리 프로그램===");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 옷 삭제");
            System.out.println("4. 프로그램 종료");
            System.out.print("메뉴 선택 :");
            int choice = sc.nextInt();
            sc.nextLine(); //int에 남아있는 잔여 버퍼 지우기

            //switch choice로 사용자에게 특정 번호를 받고 특정 번호에 맞는 case에서 해당하는 기능을 실행할 수 있도록 만든 조건문
            switch (choice) {
                case 1:
                    //ClothingStore에서 작성된 옷 추가 기능
                    cs.addClothing();
                    break;
                case 2:
                    cs.allClothing();
                    break;
                case 3:
                    System.out.println("옷이 삭제되었습니다.");
                    return;
                case 4:
                    System.out.println("옷가게를 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘못 입력했습니다. 다시 입력해 주세요.");
                    break;
            }
        }


    }
}
