package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SnackService {

    // method1 과자이름 가격 추가
    // 구름과자 2000원
    //HashMap<String, Integer> snackList
    //put 추가 출력
    //Scanner 사용 XXX

    public void method1(){
        HashMap<String, Integer> snackList = new HashMap<String, Integer>();
        snackList.put("구름과자", 2000);

        System.out.println("추가한 과자 : " + snackList);
    }

    //method2 점심메뉴 저장 (키 : 메뉴이름 값 : 분류)
    public void method2(){

        /*
        key       value
        김치찌개  한식
        파스타    양식
        짜장면    중식
        스테이크  양식
        비빔밥    한식

        메뉴 모두 출력
        점심리스트 확인 :

        파스타를 확인했을 때 파스타는 어떤 음식인지 출력 (put 이용)

        짜장면 제거 (remove)

        짜장면 제거 됐는지 확인 containsKey()

        스테이크 → 한식으로 변경

        점심리스트 모두 삭제
        */

        HashMap<String, String> lunchList = new HashMap<String, String>();
        lunchList.put("김치찌개", "한식");
        lunchList.put("파스타", "양식");
        lunchList.put("짜장면", "한식");
        lunchList.put("스테이크", "양식");
        lunchList.put("비빔밥", "한식");

        System.out.println("점심리스트 확인 : "+lunchList);

        //1. 파스타가 어떤 음식인지 확인
        String pastaType = lunchList.get("파스타");
        System.out.println("파스타는 어떤 음식인가요? : "+pastaType);//출력의 결과는 String 값으로 양식이 나옴

        //2. 짜장면 제거하고 제거된 목록 확인
        lunchList.remove("짜장면");
        System.out.println("짜장면 지운 후 리스트 : " + lunchList);

        //2-1. 짜장면 제거됐는지 확인
        boolean jjajang = lunchList.containsKey("짜장면");
        System.out.println(jjajang);

        //3. 스테이크 → 한식으로 변경
        lunchList.put("스테이크", "한식");
        System.out.println("스테이크가 한식으로 변경 됐는지 확인 : " + lunchList);

        //replace 특정 값을 변경시킨다
        lunchList.replace("스테이크", "한식"); // 위 put에 작성된 스테이크 값을 한식으로 변경할 수 있음


        //4. 점심리스트 모두 삭제
        lunchList.clear();
        System.out.println("\n점심리스트 확인 : " + lunchList);

        //5. 모두 비워졌는지 확인
        boolean tf = lunchList.isEmpty();
        System.out.println("점심이 모두 삭제 되었습니까? : " + tf);
        //isEmpty 결과 또한 boolean이기 때문에 자료형 boolean 변수명으로 담아서 사용할 수 있음


    }
}
