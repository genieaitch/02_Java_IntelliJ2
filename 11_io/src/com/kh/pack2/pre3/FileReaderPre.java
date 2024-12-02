package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderPre {

    //파일을 읽고 읽은 내용을 눈으로 확인
    //happyLunch.txt

    /*
    readRxt(String path, String fileName)

    @param path 파일 경로
    @param fileName 파일 이름
    */
    public void readRxt(String path, String fileName) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path + fileName);
            br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
            System.out.println("읽기가 완료되었습니다");
        } catch (IOException e) {
            System.out.println(e.getMessage() + "의 문제가 발생했습니다.");
        }finally {
            System.out.println("시스템을 종료합니다.");
        }

    }
}

