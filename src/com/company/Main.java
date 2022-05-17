package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(45, 3, Gender.Male, "Sheephouse");
        Sheep sheep1 = new Sheep(45, 3, Gender.Male, "Sheephouse");
        Sheep sheep4 = new Sheep(45, 3, Gender.Male, "Sheephouse");
        sheep.mathodEat();

        Cow cow = new Cow(59, 4, Gender.Female, "Cowhouse");
        Cow cow1= new Cow(59, 4, Gender.Female, "Cowhouse");
        Cow cow2= new Cow(59, 4, Gender.Female, "Cowhouse");
        Cow cow3= new Cow(59, 4, Gender.Female, "Cowhouse");
        Cow cow4= new Cow(59, 4, Gender.Female, "Cowhouse");
        cow.mathodEat();

        Horse horse = new Horse(97, 5, Gender.Female, "Horsehouse", Color.Black);
        Horse horse1 = new Horse(97, 5, Gender.Female, "Horsehouse", Color.Black);
        Horse horse2 = new Horse(97, 5, Gender.Female, "Horsehouse", Color.Black);
        horse.mathodEat();

        Farm farm = new Farm();
        farm.setAddress("Bishkek");
        farm.setOwnerName("Toms");
        farm.setCow(new Cow[] {cow1,cow2,cow,cow3,cow4});
        farm.setHorse(new Horse[]{horse,horse1,horse2});
        farm.setSheep(new Sheep[]{sheep,sheep1});



        //int[] a = new int[] {567,4567,5678,78};


        Farm farm1 = new Farm();
        farm1.setAddress("Talas");
        farm1.setOwnerName("kseniy");

        farm1.setCow(new Cow[]{cow4});
        farm1.setSheep(new Sheep[]{sheep4});
        farm1.setHorse(new Horse[]{horse2});
        System.out.println(farm1);
        System.out.println(farm);

    }
}
