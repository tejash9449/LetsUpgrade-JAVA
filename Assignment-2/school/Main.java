package com.school;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String name;
        int subject1, subject2, subject3, subject4, subject5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name");
        name = sc.nextLine();
        System.out.println("Enter " + name + "'s Five Subject's Marks ");
        System.out.println("Subject 1:");
        subject1 = sc.nextInt();
        System.out.println("Subject 2:");
        subject2 = sc.nextInt();
        System.out.println("Subject 3:");
        subject3 = sc.nextInt();
        System.out.println("Subject 4:");
        subject4 = sc.nextInt();
        System.out.println("Subject 5:");
        subject5 = sc.nextInt();

        int totalmarks =subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = (float) totalmarks*100/500;

        int num = (int) percentage / 10;
        switch (num) {
            case 4:
            case 5:{
                System.out.println("Grade : C+ , percentage : " + percentage);
                break;
            }
            case 6:{
                System.out.println("Grade : B , percentage : " + percentage);
                break;
            }
            case 7 :{
                System.out.println("Grade : B+ , percentage : " + percentage);
                break;
            }
            case 8 :{
                System.out.println("Grade : A , percentage : " + percentage);
                break;
            }
            case 9: {
                System.out.println("Grade : A+ , percentage : " + percentage);
                break;
            }
            default:{
                System.out.println(name + " is Failed ,grade : C ,percentage :" + percentage);
                break;
            }
        }
    }
}
