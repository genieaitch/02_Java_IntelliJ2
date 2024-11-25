package com.kh.poly.pack2.maver.animalPre;

public class Cat extends Animal {
    private String 색상;
    private int 펀치횟수;

    //기본생성자
    public Cat(){
        super();
    }

    //필수생성자

    public Cat(String name, int age, String 색상, int 펀치횟수) {
        super(name, age);
        this.색상 = 색상;
        this.펀치횟수 = 펀치횟수;
    }

    //Setter

    public void set색상(String 색상) {
        this.색상 = 색상;
    }

    public void set펀치횟수(int 펀치횟수) {
        this.펀치횟수 = 펀치횟수;
    }

    //Getter

    public String get색상() {
        return 색상;
    }

    public int get펀치횟수() {
        return 펀치횟수;
    }

    //toString

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "색상='" + 색상 + '\'' +
                ", 펀치횟수=" + 펀치횟수 +
                '}';
    }
}
