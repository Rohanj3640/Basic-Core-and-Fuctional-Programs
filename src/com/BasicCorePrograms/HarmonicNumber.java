package com.BasicCorePrograms;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to Find it's Harmonic Number : ");
        int number = sc.nextInt();
        sc.close();
        getHarmonicNumber(number);  // function call
    }
    public static void getHarmonicNumber(int number) {
        double harmonicNumber = 0;
        if (number > 0){
            for (int i = 1; i <= number; i++){
                harmonicNumber = (1.0 / i);
            }
            System.out.printf("Harmonic Number is : %.4f ",harmonicNumber);
        }
        else
            System.out.println("Number Should be Grether Than 0");
    }
}
