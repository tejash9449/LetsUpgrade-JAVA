package com.employeeSector;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    Scanner sc=new Scanner(System.in);

    public void getDetails(){
        System.out.println("Empolyee Name :");
        name=sc.nextLine();
        System.out.println("Age :");
        age=sc.nextInt();
        System.out.println("Salary : ");
        salary=sc.nextDouble();
        System.out.println("Designatin : ");
        designation=sc.next();
    }

    public void displayDetails(){
        System.out.println("Empolyee Name : " + name);
        System.out.println("age : " + age);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : "+designation);
    }

}
