package com.FunctionalPrograms;
import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        // taking inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Fahrenheit : ");
        double t = sc.nextDouble();
        System.out.print("Enter a Wind Speed in Miles Per Hour : ");
        double v = sc.nextDouble();
        sc.close();

        // calculations and printing
        double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * (Math.pow(v, 0.16)));
        System.out.printf("Wind Chill is : %.2f", windChill);
    }
}