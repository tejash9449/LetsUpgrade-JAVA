package com.employeeSector;

import java.util.Scanner;

public class Engineer extends Employee{
    private String goal;
    Scanner sc=new Scanner(System.in);
    public void getGoal(){
        System.out.println("Enter your goal");
        goal=sc.next();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Goal : "+goal);
    }
}
