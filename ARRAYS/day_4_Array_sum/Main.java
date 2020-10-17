package com.day_4_Array_sum;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //3. create an int array of size 5 which takes all the values from the user.
        // add all the value and print the sum.
        int[] numbers=new int[5];
        System.out.println("Enter the Five Numbers");
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }

        System.out.println("The Total Sum of the numbers is "+sum);
    }
}
