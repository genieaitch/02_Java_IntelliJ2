package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> userList = new ArrayList<>();

    //2. 스캐너 사용
    private Scanner sc = new Scanner(System.in);

    //3. 사용자 추가 기능 만들기
    public void addUser(){
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("비밀번호 :");
        String password = sc.nextLine();
        System.out.print("이메일 :");
        String email = sc.nextLine();

        User nu = new User(name, password, email);
        userList.add(nu);
        System.out.println("["+name+"] 추가 완료");
    }

    //4. 유저 목록 조회하기
    public void allUsers(){
        ArrayList<User> users = new ArrayList<User>();

        System.out.println("\n==== 추가된 사용자 목록 ====");
        //만약에 등록된 사용자가 없다면 "등록된 사용자가 없습니다." 출력
        if(userList.isEmpty()){
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            //사용자가 1명이라도 존재한다면 향상된 for문을 이용해서 유저들을 모두 출력
            for(int i=0; i<userList.size(); i++){
                System.out.println(userList.get(i).toString());
            }
            /*for (User nu : userList) {
                System.out.println(userList);*/
            }
        }
    }
