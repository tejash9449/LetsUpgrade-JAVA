package com.employeeSector;

import java.util.Scanner;

public class Doctor extends Employee {
    private String patientname;
    private int patientage;
    private String description;
    Scanner sc=new Scanner(System.in);

    public void getPatientDetails(){
        sc.next();
        System.out.println("Patient Name :");
        patientname=sc.nextLine();
        System.out.println("Age :");
        patientage=sc.nextInt();
        sc.next();
        System.out.println("Description");
        description=sc.nextLine();
    }

    public void displayPatientDetails(){
        System.out.println("Patient Details");
        System.out.println("Name Age Description");
        System.out.println(patientname+" "+patientage+" "+description);
    }




}
