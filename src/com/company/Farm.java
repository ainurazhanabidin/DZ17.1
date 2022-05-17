package com.company;

import java.util.Arrays;

public class Farm {
    private String address;
    private String ownerName;
    private Cow[] cow;
    private Horse[] horse;
    private Sheep[] sheep;

    public Farm(String address, String ownerName, Cow[] cow, Horse[] horse, Sheep[] sheep) {
        this.address = address;
        this.ownerName = ownerName;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
    }
    public Farm(){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cow=" + Arrays.toString(cow) +
                ", horse=" + Arrays.toString(horse) +
                ", sheep=" + Arrays.toString(sheep) +
                '}';
    }
}
