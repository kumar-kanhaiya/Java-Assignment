package JAVACHALLENGE100Days.Day2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = input.nextInt();
        System.out.printf("factorial of %d is %d " , number , factorialUsingRecursion(number));

    }
    public static int factorialUsingRecursion(int number ){
        // base case
        if (number == 1){
            return 1;
        }
        return number * factorialUsingRecursion(number - 1 );
    }
}
