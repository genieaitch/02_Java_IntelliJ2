package com.kh.poly.pack2.maver.animalPre;

public class Dog extends Animal {
    private String 품종;
    private int 산책횟수;

    //기본생성자
    public Dog(){
        super();
    }

    //필수생성자

    public Dog(String name, int age, String 품종, int 산책횟수) {
        super(name, age);
        this.품종 = 품종;
        this.산책횟수 = 산책횟수;
    }

    //Setter

    public void set품종(String 품종) {
        this.품종 = 품종;
    }

    public void set산책횟수(int 산책횟수) {
        this.산책횟수 = 산책횟수;
    }

    //Getter


    public String get품종() {
        return 품종;
    }

    public int get산책횟수() {
        return 산책횟수;
    }

    //toString

    @Override
    public String toString() {
        return "Dog{" + super.toString()+
                "품종='" + 품종 + '\'' +
                ", 산책횟수=" + 산책횟수 +
                '}';
    }
}
