package com.FunctionalPrograms;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordinate Value: ");
        int x = sc.nextInt();
        System.out.print("Enter y co-ordinate Value: ");
        int y = sc.nextInt();
        sc.close();

        // formula
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.printf("Euclidean Distance is: %.2f", distance);   // %.2f is for to print only two digits after point
    }
}