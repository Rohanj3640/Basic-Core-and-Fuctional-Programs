package com.BasicCorePrograms;
import java.util.Scanner;
public class LargestOfThreeNumber {
    public static void main(String[] args) {

        // inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        scanner.close();

        // logic
        int largestNumber = Math.max(Math.max(num1,num2),num3);
        System.out.println(largestNumber+ " is the Largest");
    }
}
