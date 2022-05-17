package com.company;

public class Horse extends Animal {
    private int weight;
    private int age;
    private Gender  gender;
    private String nickName;
    private Color color;

    public Horse(int weight, int age, Gender gender, String nickName, Color color) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
        this.color = color;
    }

    @Override
    void mathodEat() {
        System.out.println(nickName+" drink a milk");

    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender=" + gender +
                ", nickName='" + nickName + '\'' +
                ", color=" + color +
                '}';
    }
}
