package com.BasicCorePrograms;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        //Take input from the user
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a dividend: ");
        int num1 = s.nextInt();
        System.out.print("Enter a divisor: ");
        int num2 = s.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is : " + quotient);
        System.out.println("The Remainder is : " + remainder);

    }
}
