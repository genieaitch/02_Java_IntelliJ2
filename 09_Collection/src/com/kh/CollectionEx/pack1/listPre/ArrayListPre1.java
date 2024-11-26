package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    //메서드1 새우깡 맛동산 포카칩 고구마칩 고래밥
    //추가하고 출력하기, 총 몇 개인지 확인
    //add size() String만 넣을 수 있게 자료형 제한
    
    public void method1(){
        ArrayList<String> list1 = new ArrayList<String>();
        
        list1.add("새우깡");
        list1.add("맛동산");
        list1.add("포카칩");
        list1.add("고구마칩");
        list1.add("고래밥");

        System.out.println("list에 들어 있는 값 : " + list1);
        System.out.println("list에 들어 있는 값 총 개수 : " + list1.size());

        //만약에 index 1자리에 허니버터칩을 넣고 싶다면 → add(index자리넘버, 넣고자하는 값)
        list1.add(1,"허니버터칩");
        System.out.println("list에서 허니버터칩 추가 확인 : " + list1);

        // 3. 특정 위치의 값 가져오기 get(int index자리넘버)
        // 3번째 작성된 값이 무엇인지 가져올 예정
        System.out.println("3번째 인덱스에 저장된 값 : " + list1.get(3));

        // 4. 2번째 저장된 값을 망고과자로 변경 set(index자리넘버, 변경할 값)
        list1.set(2, "망고과자");
        System.out.println("망고과자로 변경됐는지 확인 :" + list1);

        // 5. 특정 위치의 값을 삭제 remove("삭제할 값") or remove(index자리값)
        list1.remove(1);
        System.out.println("index 1번 자리 값 삭제 : " + list1);

        list1.remove("포카칩");
        System.out.println("포카칩이 무사히 사라졌는지 확인 : " + list1);

        // 6. contains("값") or contains (index 자리값)리스트에 찾는 값이 들어있는지 확인
        System.out.println("망고과자가 존재하나요? :" + list1.contains("망고과자"));

        // 7. clear(); list안에 들어있는 모든 값 삭제
        list1.clear();
        System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : " + list1.isEmpty());

        //contains, isEmpty 는 값이 boolean 값으로 나옴
    }

    /*
    method2 과일을 저장하고 수정하고 삭제하고 비우고 무사히 비웠는지 확인하는 기능
    사과 포도 바나나 망고
    */
    public void method2(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("사과");
        list1.add("포도");
        list1.add("바나나");
        list1.add("망고");
        System.out.println("초기 과일 리스트 : " + list1);

        list1.add(1, "오렌지");
        System.out.println("두 번째 위치 오렌지 추가 : " + list1);

        list1.set(3, "파인애플");
        System.out.println("바나나를 파인애플로 변경 : " + list1);

        list1.remove(0);
        System.out.println("첫 번째 과일 삭제 : " + list1);

        list1.remove("망고");
        System.out.println("망고 삭제 : " + list1);

        if(list1.contains("사과")){
            list1.remove("사과");
            list1.remove("사과를 삭제한 리스트 : " + list1);
        } else {
            System.out.println("사과가 리스트에 없습니다.");
        }
        
        list1.clear();
        System.out.println("리스트가 비어있는지 : " + list1.isEmpty());
    }


    /*method3 기본 타입으로 자료형 제한해서 저장*/
    public void method3(){
        //1. 정수(int)타입 제한
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("IntList : "+intList);

        //2. 문자(char) 타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('가');
        charList.add('b');
        charList.add('나');
        System.out.println("CharList : "+charList);
    }
}
