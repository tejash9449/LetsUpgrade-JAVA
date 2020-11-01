package com.employeeSector;

public class Main {

    public static void main(String[] args) {
        Doctor[] doctor=new Doctor[3];
        Engineer[] engineer = new Engineer[3];
        Pilot[] pilot = new Pilot[3];

        for (int i = 0; i < 3; i++) {
            doctor[i] = new Doctor();
            engineer[i] = new Engineer();
            pilot[i] = new Pilot();
        }
        System.out.println("Enter the Doctor Details");
        for (int i = 0; i < 3; i++) {
            doctor[i].getDetails();
        }
        System.out.println("Enter the Engineer Details");
        for (int i = 0; i < 3; i++) {
            engineer[i].getDetails();
            engineer[i].getGoal();
        }
        System.out.println("Enter the pilot Details");
        for (int i = 0; i < 3; i++) {
            pilot[i].getDetails();
            pilot[i].getIdNumber();
        }

        System.out.println("Dispalying Empolyee Details");
        System.out.println("Doctor Employee Details : ");
        for (int i = 0; i < 3; i++) {
            doctor[i].displayDetails();
        }
        System.out.println("Engineer Employee Details :");
        for (int i = 0; i < 3; i++) {
            engineer[i].getDetails();
        }
        System.out.println("pilot Employee Details :");
        for (int i = 0; i < 3; i++) {
            pilot[i].getDetails();
        }

    }
}
