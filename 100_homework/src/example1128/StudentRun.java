package example1128;

public class StudentRun {
    public static void main(String[] args) {
        Student student1 = new Student("김길동","자바", 100);
        Student student2 = new Student("박길동","디비",50);
        Student student3 = new Student("이길동", "화면", 85);
        Student student4 = new Student("정길동","서버",60);
        Student student5 = new Student("홍길동","자바",20);

        System.out.println("========학생 정보 출력========");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student5);
    }
    //학생 데이터 5개 만들고 결과 확인
}
