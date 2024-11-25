package com.kh.oop.lombokPre;

public class PersonRun {
    // 어노테이션으로 만든 게터 세터 필수생성자를 이용해서 값 집어넣고 저장된 값 확인하기
    public static void main(String[] args) {
        // person1 은 setter로 이용해서 부분적으로 값을 넣고 출력
        Person person = new Person();
        person.setName("John");

        // Getter로 저장되어있는 값을 System.out.println을 활용해서 저장된 값 확인하기
        System.out.println(person.getName());

        // person2는 allArgsConstructor를 이용해서 모든 값을 한 번에 넣고 출력
        Person person2 = new Person();
    }
}
