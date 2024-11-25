package com.kh.poly.pack2.maver.animalPre;

public class Animal {
    private String name;
    private int age;

    //기본생성자
    public Animal() {
    }

    //필수생성자

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //toString

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
