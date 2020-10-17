package com.day_4_avengerDetail;

public class Main {

    public static void main(String[] args) {
        // DAY-4 ASSIGNMENT
        /* 1. create a class avenger with properties (name,age,power,weapon,planet) and
        with functions getDetails() and displayDetails(). create 5 objects as array in main method
        and call using loop.*/
        Avenger[] member=new Avenger[5];

        for(int i=0;i<5;i++){
            member[i]=new Avenger();
            member[i].getDetails();
        }
        for(int i=0;i<5;i++){
            member[i].displayDetails();
        }
    }
}
