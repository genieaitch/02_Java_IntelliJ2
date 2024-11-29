package com.kh.pack2.pre3;

import java.awt.*;
import java.io.*;

public class FileReaderEx {

    public void method1() {
        String path = System.getProperty("user.home") + "/Desktop/";
        String fileName = "lunch.txt";

        FileReader file = null;
        try {
            file = new FileReader(path + fileName);
            BufferedReader br = new BufferedReader(file);
            String line; //변수 선언만 하고 아무 값도 들어있지 않는 상태

            //while 내부에 readLine()을 작성하지 않으면 계속 똑같은 줄만 바라보고 있음
        while ((line = br.readLine()) !=null) {
                System.out.println(line);
        }

        } catch (IOException e) {
            System.out.println(e.getMessage() + "의 문제가 발생했습니다.");
        }


    }

}
