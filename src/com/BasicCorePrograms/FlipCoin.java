package com.BasicCorePrograms;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {

              //Create object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin is flipped : ");
             // initialize, scanner to the next token of input as int
        int i = sc.nextInt();
        sc.close();
        getPercentage(i);
    }
    static void getPercentage(int flipCoin)
    {
        //initializing
        int countHead=0;
        int countTail=0;
        float percentH,percentT;

        //using math.random we check the values
        for (int n = 0; n < flipCoin; n++)
        {
            if(Math.random()<0.5)
            {
                countHead++;
            }
            else
            {
                countTail++;
            }
        }

        System.out.println("Number of head = "+countHead);
        System.out.println("Number of tail = "+countTail);

               //checking percentage of Head and Tail
        percentH=(countHead*100)/flipCoin;
        percentT=(countTail*100)/flipCoin;

                  //printing the percentage of Head and Tail
        System.out.println("Percentage of head " +percentH);
        System.out.println("Percentage of tail " +percentT);


    }
}