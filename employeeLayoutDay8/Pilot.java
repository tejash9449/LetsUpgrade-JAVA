package com.employeeSector;

import java.util.Scanner;

public class Pilot extends Employee{
    private int idno;
    Scanner sc=new Scanner(System.in);
    public void getIdNumber(){
        System.out.println("Enter your Id number");
        idno=sc.nextInt();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Id No : "+idno);
    }
}
