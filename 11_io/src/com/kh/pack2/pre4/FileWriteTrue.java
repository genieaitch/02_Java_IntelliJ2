package com.kh.pack2.pre4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTrue {
    public void writeTxt() {
        String path = System.getProperty("user.home") + "/Desktop/";
        Scanner scanner = new Scanner(System.in);
        System.out.print("내용을 이어서 작성할 파일명을 입력하세요 : ");
        String fileName = scanner.nextLine();
        //만약에 파일이 존재하지 않는다면 파일이 존재하지 않습니다.
        //파일을 생성하려면 Yes를 입력하고 생성하지 않는다면 No 또는 아무 글자나 입력하세요.

        File file = new File(path + fileName + ".txt"); //fileName 뒤에 확장자 표기를 붙여주기
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            System.out.print(fileName + "파일을 생성하시겠습니까? \nYes = 생성 NO = 생성 안함 : ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                try {
                    file.createNewFile();
                    String line;
                    System.out.println("파일을 생성합니다." + file.getAbsolutePath());
                    System.out.println("===["+file+"]안에 들어갈 내용 작성=== ");
                } catch (IOException e) {
                    System.out.println("예기치못한 상황으로 파일을 생성하지 못했습니다." + e.getMessage());
                }
            }else {
                System.out.println("파일을 생성하지 않았습니다."+"\n 파일이 없으므로 작성할 내용 또한 없기 떄문에 프로그램을 종료합니다.");
                return;
        }
        }

        //파일 생성까지 됐다면 파일 안에 글을 작성하기
        /*try() 안에 1가지 코드만 작성할 경우 뒤에 ; 생략 가능
        두가지 이상 작성할 경우 ; 기능이나 명칭 구분짓기 해주어야함
        * */
        try(FileWriter fw = new FileWriter(file, true);) {
            String line;
            while(true) {
                System.out.println("작성할 내용(exit=종료 : )");
                line = scanner.nextLine();
                if("exit".equalsIgnoreCase(line)) {
                    System.out.println("내용 작성을 종료합니다.");
                    return;
                }
                fw.write(line+"\r\n");
                /*
                * \r 키보드 커서를 현재 줄의 맨 앞으로 이동시키는 역할
                * 예를 들어 \naver와 같은 상황이 발생할 경우를 방지하기 위해 커서를 기본적으로 맨 앞으로 보내서
                * \n을 활용하여 줄 바꿈 처리를 할 수 있도록 설정
                * window 컴퓨터에서는 사용자들이 글을 작성하며 줄바꿈을 할 때마다 \r\n 함께 이용
                */
                System.out.println("내용이 추가되었습니다.");
            }
            //exit를 입력하면 종료 설정
            //while문 이용해서 exit를 입력하기 전까지 글 내용 작성할 수 있게 하고 한 줄 작성될 때마다 System.out.println이용해서 내용이 추가되었습니다! 를 반복해서 보여주기

        } catch (IOException e) {
            System.out.println("글 작성 도중 문제가 발생했습니다" +e.getMessage());
        }finally {
            System.out.println("글 작성을 종료합니다.");
        }
    }
}
