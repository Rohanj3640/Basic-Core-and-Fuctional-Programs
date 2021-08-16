package com.FunctionalPrograms;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        // taking inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        sc.close();

        // calculations
        double deltaValue = (b*b) - (4.0*a*c);
        System.out.println("Delta Value is : " + deltaValue);

        double root1Value = (-b + Math.sqrt(deltaValue)) / (2*a); //root1
        System.out.printf("Root 1 : %.2f ", root1Value);
        double root2Value = (-b - Math.sqrt(deltaValue)) / (2*a); //root2
        System.out.printf("\nRoot 2 : %.2f ", root2Value);
    }
}
