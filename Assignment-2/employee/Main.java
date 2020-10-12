package com.employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //taking input from user
        System.out.println("Enter the Employee Name :");
        String name = sc.nextLine();

        System.out.println("Enter the Birth date");
        int birth_date = sc.nextInt();
        System.out.println("Enter the Birth month");
        int birth_month = sc.nextInt();
        System.out.println("Enter the Birth year");
        int birth_year = sc.nextInt();

        System.out.println("Enter the Montly Salary");
        int monthly_salary = sc.nextInt();

        //annual salary
        float annualSalary= monthly_salary*12;

        //calculating age
        int present_year=2020;
        int age=present_year-birth_year;

        //Tax amount
        double tax=0d;
        if (annualSalary<=200000){
            tax= annualSalary*0.05;
        }
        else if (annualSalary<=300000){
            tax=200000*0.05+(annualSalary-200000)*0.1;
        }
        else if (annualSalary<=400000){
            tax=200000*0.05+100000*0.1+(annualSalary-300000)*0.15;
        }
        else if (annualSalary>400000){
            tax=200000*0.05+100000*0.1+100000*0.15+(annualSalary-400000)*0.20;
        }

        // Displaying
        System.out.println("Employee Name : "+ name);
        System.out.println("Age : "+age);
        System.out.println("Annual Salary : "+ annualSalary);
        System.out.println("Tax amount : "+ tax);


    }
}
