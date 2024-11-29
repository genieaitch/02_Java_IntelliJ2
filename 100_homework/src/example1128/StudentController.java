package example1128;

public class StudentController {
    private Student[] sArr = new Student[5];
    public static final int CUT_LINE = 60; //통과 기준 점수는 변할 일이 없기 때문에 상수 표기

    public StudentController() {
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동","서버",60);
        sArr[4] = new Student("홍길동","자바",20);
    }

    //학생정보 출력
    public Student[] getStudents() {
        return sArr;
    }

    //점수합계반환
    public int sumScore(){
        int sum = 0;
        for(Student s : sArr){
            sum += s.getScore();
        }
        return sum; //for문이 종료되면 결과를 전달하는 return 작성
        //왜냐하면 public 옆이 void가 아닌 int 값이기 때문
    }

    //점수합계와 평균 반환
    public double[] avgScore(){
        int sum = sumScore();
        double avg = (double)sum/ (double)sArr.length;
        return new double[]{avg,sum};
    }
}
