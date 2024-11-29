package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderPre {

    //파일을 읽고 읽은 내용을 눈으로 확인
    //happyLunch.txt

    /*
    readRxt(String path, String fileName)

    @param path 파일 경로
    @param fileName 파일 이름
    */
    public void readRxt(String path, String fileName){
        FileReader fr = null;
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) !null){
            System.out.println(line);
        }

    }
}
