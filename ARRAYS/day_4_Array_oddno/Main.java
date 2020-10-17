package com.day_4_Array_oddno;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //2. create an int array with 5 values and print only odd values


        int[] numbers=new int[5];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Five Numbers : ");
         for(int i=0;i<5;i++){
             numbers[i]=sc.nextInt();
         }
        System.out.println("ODD NUMBERS :- ");
         for(int i=0;i<5;i++){
             if(numbers[i] % 2 != 0){
                 System.out.println(numbers[i]);
             }
        }

    }
}
