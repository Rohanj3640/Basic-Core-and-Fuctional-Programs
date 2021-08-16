package com.BasicCorePrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = sc.nextInt();
        sc.close();

        // validating if entered year is in 4 digit
        if (year >= 999)
            getLeapYear(year);
        else
            System.out.println("Please Enter Year in 4 Digits");
    }

    public static void getLeapYear(int year) {

        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("It an leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
