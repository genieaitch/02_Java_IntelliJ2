package example1128;

public class practice7Run extends practice7 {
    public static void main(String[] args) {

        practice7 employee = new practice7(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
        employee.toString();

        practice7 employee2 = new practice7();
        employee2.setEmpNo(100);
        employee2.setEmpName("홍길동");
        employee2.setDept("영업부");
        employee2.setJob("과장");
        employee2.setAge(25);
        employee2.setGender('남');
        employee2.setSalary(2500000);
        employee2.setBonusPoints(0.05);
        employee2.setPhone("010-1234-5678");
        employee2.setAddress("서울시 강남구");

        System.out.println(employee);
        System.out.println(employee2);

    }
}
