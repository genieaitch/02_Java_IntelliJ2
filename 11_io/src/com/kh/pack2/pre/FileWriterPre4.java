package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    public static void main(String[] args) {
        //menu.txt
        //파일 존재 유무 확인하고 파일이 존재하면 이어쓰기

        String path = System.getProperty("user.home") + "/Desktop/";
        String filename = "menu.txt";

        File file = new File(path + filename);

        if (file.exists()) {
            System.out.println("파일이 존재하여 내용 추가가 가능합니다.");
            try {
            FileWriter fw = new FileWriter(file,true);
                fw = new FileWriter(file);
            String content = "\n떡볶이\n순대\n마라탕";
                fw.write(content);
                fw.close();
            } catch (IOException e) {
                System.out.println("글자 작성 중 문제가 발생했습니다");
            }} else {
            try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file,true);
                System.out.println("파일 생성을 완료했습니다.");
            String content = "\n떡볶이\n순대\n마라탕";
                fw.write(content);
                fw.close();
                System.out.println("내용이 추가되었습니다.");
            } catch (IOException e) {
                System.out.println("글자 작성 중 문제가 발생했습니다");
            } finally {
                System.out.println("작업을 종료합니다.");
            }
        }
    }}