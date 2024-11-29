package com.kh.pack2.pre;

import java.io.*;
import java.util.Scanner;

public class FileWritePre3 {
    public static void main(String[] args) {
        //1. 파일 생성
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "menus.txt";


        //2. 파일 존재여부 확인
        File file = new File(path+fileName);
        /*if (file.exists()) {
            System.out.println("파일이 이미 존재합니다. : " + file.getAbsolutePath());//파일 존재 알려줌
            System.out.println("작업을 종료합니다.");
            return;
        } else {
            try {
                file.createNewFile();
            System.out.println("파일이 생성되었습니다. : " + fileName);
            } catch (IOException e) {
            System.out.println("예상치 못한 문제로 파일을 생성하지 못했습니다.");
            }
        }*/

        if (!file.exists()) {//파일이 존재하지 않는 게 맞다면
            try {
                file.createNewFile();
                System.out.println("파일 만들기에 성공했습니다. : " +fileName);
            } catch (IOException e) {
                System.out.println("파일 만들기에 실패했습니다. : " + e.getMessage());
                System.out.println("작업을 종료합니다.");
            }
        } else {
            System.out.println("이미 존재하는 파일입니다. : " + file.getAbsolutePath()); //이미 존재하는 파일 위치 확인
            System.out.println("작업을 종료합니다.");
            return;
        }

        //3. 파일 작성(이어쓰기모드)
        //빨간 밑줄 위에 마우스를 대고 alt + enter를 입력하면 선택할 수 있는 항목 표기
        try {
            FileWriter fw = new FileWriter(file,true); //true작성 안하면 기본적으로 false = 덮어쓰기
            //String content = "양식 \n한식 \n중식 \n일식";
            Scanner sc = new Scanner(System.in);
            System.out.print("작성할 내용을 입력하세요. : ");
            String content = sc.nextLine();
            fw.write(content); //파일에 내용 작성하기
            fw.close();
            System.out.println("파일에 내용이 추가되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 내 글작성을 실패했습니다.");
        } finally{
            //어떤 파일의 글쓰기 작업을 종료하는지 표기
            System.out.println(fileName + "작업을 종료합니다.");
        }

    }
}
