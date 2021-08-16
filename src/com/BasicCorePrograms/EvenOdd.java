package com.BasicCorePrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int inputNumber = sc.nextInt();
        sc.close();

        // logic
        if (inputNumber % 2 == 0) {
            System.out.println(inputNumber + " is Even Number");
        }
        else {
            System.out.println(inputNumber + " is Odd Number");
        }
    }
}
