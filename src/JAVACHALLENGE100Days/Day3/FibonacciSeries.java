package JAVACHALLENGE100Days.Day3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int first = 0 ;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        while(number!= 2){

            int third = first +second;
            System.out.print(third + " ");
            first = second;
            second = third;
            number -- ;
        }
    }
}
