package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> userList = new ArrayList<>();

    //2. 스캐너 사용
    private Scanner sc = new Scanner(System.in);

    //3. 사용자 추가 기능 만들기
    public void addUser() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("비밀번호 :");
        String password = sc.nextLine();
        System.out.print("이메일 :");
        String email = sc.nextLine();

        User nu = new User(name, password, email);
        userList.add(nu);
        System.out.println("[" + name + "] 추가 완료");
    }

    //4. 유저 목록 조회하기
    public void allUsers() {
        ArrayList<User> users = new ArrayList<User>();

        System.out.println("\n==== 추가된 사용자 목록 ====");
        //만약에 등록된 사용자가 없다면 "등록된 사용자가 없습니다." 출력
        if (userList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            //사용자가 1명이라도 존재한다면 향상된 for문을 이용해서 유저들을 모두 출력
            for (int i = 0; i < userList.size(); i++) {
                System.out.println(userList.get(i).toString());
            }
        }
    }

    //5. 유저 삭제하기
    public void removeUser() {
        //ClothingStore 방법과 동일하게 유저이름을 찾고 유저를 제거
        System.out.println("\n=== 유저 삭제하기===");
        System.out.print("삭제할 유저의 이름을 입력하세요 : ");
        String username = sc.nextLine();

        boolean found = false; //삭제 여부를 확인하기 위한 변수

        for (int i = 0; i < userList.size(); i++) {
            //만약에 사용자이름이 유저목록에 일치하는 유저가 존재한다면
            if (userList.get(i).getUsername().equals(username)) {
                userList.remove(i); //해당하느 index 번호를 삭제
                System.out.println("[" + username + "] 유저가 성공적으로 삭제되었습니다.");
                found = true;
                break; //삭제 후 반복문 종료
            }
        }
        //만약에 일치하는 유저가 없다면
        if(!found){
            System.out.println("[" + username + "] 회원을 찾을 수 없습니다.");
        }

    }
}
