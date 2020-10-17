package com.day_4_avengerDetail;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Avenger {
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;
    Scanner sc=new Scanner(System.in);

     public void getDetails(){
         System.out.println("Enter the Avenger Name :");
         name=sc.nextLine();
         System.out.println("Enter His Age ");
         age=sc.nextInt();
         System.out.println("Enter His Power : ");
         power=sc.next();
         System.out.println("Enter His Weapon : ");
         weapon=sc.next();
         System.out.println("Enter the Planet name,He is from : ");
         planet=sc.next();
     }
     public void displayDetails(){
         System.out.println("Avenger Name : "+name);
         System.out.println("Age : "+age);
         System.out.println("Power : "+power);
         System.out.println("Weapon : "+weapon);
         System.out.println("Planet He Lived : "+planet);
         System.out.println("--------------------------------------------------");

     }







}
