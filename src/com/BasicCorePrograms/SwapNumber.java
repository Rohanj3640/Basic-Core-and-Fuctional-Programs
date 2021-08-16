package com.BasicCorePrograms;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        // x and y are to swap
        int i, n, t;
        //Create an object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y: ");
        i = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Before swapping numbers: "+i +"  "+ n);
        /*swapping */
        t = i;
        i = n;
        n = t;
        System.out.println("After swapping number : "+i +"   "+ n);
        System.out.println( );
    }
}
