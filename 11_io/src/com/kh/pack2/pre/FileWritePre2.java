package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre2 {

    //바탕화면 lunch.txt
    //먹고싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고 파일이 존재한다면 이미지 존재합니다 와 동시에 프로그램 return으로 종료
    //main() 메서드 작성

    public static void main(String[] args) {
        //1. 파일 생성
        String path = System.getProperty("user.home")+"/Desktop/lunch.txt";
        File file = new File(path);

        //2. 파일 존재여부 확인
        try {
            if(file.exists()){
                System.out.println("파일이 존재합니다.");
                System.out.println("작업을 종료합니다");
                return;
            } else {
                file.createNewFile();
                System.out.println("파일을 생성하였습니다.");
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }

        //3. 파일 작성
        try {
            FileWriter fw = new FileWriter(file);
            String content = "먹고싶은 점심 메뉴 \n덮밥 \n칼국수 \n마라탕 \n김치찌개 \n하지만 오늘은 샐러드ㅠㅠ";

            fw.write(content);
            fw.close();

            System.out.println("작업을 성공하였습니다.");
        } catch (IOException e) {
            System.out.println("작업을 실패했습니다. 다시 시도해주세요.");
        } finally {
            System.out.println("작업을 종료합니다");
        }

    }
}
