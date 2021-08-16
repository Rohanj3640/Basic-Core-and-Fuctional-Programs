package com.BasicCorePrograms;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        sc.close();
        getPower(number);
    }
    public static void getPower(int number){
        int power = 1;
        if (number > 0 && number < 31){
            for (int i = 1; i <= number; i++){
                power = power * 2;
                System.out.println(2 + " to the Power " +i+ " : "+ power);
            }
        }
        else
            System.out.println("Your input is other than 'int' datatype limit");
    }
}
