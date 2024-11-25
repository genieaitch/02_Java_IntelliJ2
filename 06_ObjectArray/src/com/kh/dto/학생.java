package com.kh.dto;
//DTO : Data Transfer Object
public class 학생 {
    //필드 인스턴트 변수(=static이 없음) 멤버 변수
    private String studentNumber; //학번
    private String studentName; //학생이름
    private char gender;

    //메서드(기본 생성자, 필수 생성자, Setter, Getter, ToString)

    //기본생성자

    public 학생() {
    }

    //필수생성자

    public 학생(String studentNumber, String studentName, char gender) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.gender = gender;
    }

    //setter

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //getter

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGender() {
        return gender;
    }
    //toStirng

    @Override
    public String toString() {
        return "학생{" +
                "studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                ", grade=" + gender +
                '}';
    }
}
