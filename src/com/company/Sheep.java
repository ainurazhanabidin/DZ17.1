package com.company;

public class Sheep extends Animal{
    private int weight;
    private int age;
    private Gender gender;
    private String nickName;


    public Sheep(int weight, int age, Gender gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    void mathodEat() {
        System.out.println(nickName+ "eating a straws");

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
