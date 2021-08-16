package com.BasicCorePrograms;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {

        // input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        char sc = scanner.next().charAt(0);
        scanner.close();

        // logic
        if(sc == 'a' || sc == 'e' || sc == 'i' || sc == 'o' || sc == 'u' || sc == 'A' || sc == 'E' || sc == 'I' || sc == 'O' || sc == 'U' )
            System.out.println(sc + " is Vowel");
        else
            System.out.println(sc + " is Consonant");
    }
}
