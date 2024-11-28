package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {

    //method1 : 바탕화면에 profileImg 라는 폴더가 존재하는지 확인하고 존재하지 않으면 폴더 생성

    public void method1(){
        File dir = new File(System.getProperty("user.home")+"/Desktop/profileImg");

        System.out.println("폴더 위치 : " + dir.getPath());
        System.out.println("폴더 절대경로 : " + dir.getAbsolutePath());
        System.out.println("폴더 이름 : " + dir.getName());
        System.out.println("폴더 존재 여부 : " + dir.exists());

        if(dir.exists()){
            System.out.println("이미 존재하는 폴더입니다.");
        } else {
            dir.mkdir();
            System.out.println(dir.getName() + "폴더를 생성했습니다.");
        }
    }
    //method2 : 바탕화면에 newFile.txt 생성
    public void method2(){
        File dir2 = new File(System.getProperty("user.home")+"/Desktop/newFile.txt");

        if(dir2.exists()){
            System.out.println("이미 존재하는 파일입니다.");
        } else {
            try {
                dir2.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성 중 예기치 못한 문제가 발생했습니다.");
            }
            System.out.println("파일이 생성되었습니다. 경로 : "+ dir2);
        }
    }
}
