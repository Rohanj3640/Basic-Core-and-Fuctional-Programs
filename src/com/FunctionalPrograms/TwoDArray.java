package com.FunctionalPrograms;
import java.util.Scanner;

public class TwoDArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // input array column and row sizes
        System.out.print("Enter The Row Size : ");
        int rowSize = sc.nextInt();
        System.out.print("Enter The Column Size : ");
        int columnSize = sc.nextInt();

        printArray(rowSize, columnSize);   // function call
    }

     // get column and row size from user
     // ask user to enter the elements to the position in the  two dimensional array
     // the print the array

    public static void printArray(int rowSize, int columnSize) {
        int[][] twoDArray = new int[rowSize][columnSize];

        // input array elements
        for (int i=0; i<rowSize; i++) {
            for (int j=0; j<columnSize; j++) {
                System.out.print("Enter The Value at: "+i+ " "+j +" : ");
                twoDArray[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // printing array
        for (int i=0; i<rowSize; i++) {
            for (int j=0; j<columnSize; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}