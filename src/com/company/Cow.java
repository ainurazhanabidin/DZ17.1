package com.company;

public class Cow extends  Animal {
    private int weight;
    private int age;
    private Gender gender;
    private String nickName;

    public Cow(int weight, int age, Gender gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    void mathodEat() {
        System.out.println(nickName+" drink water");

    }

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
