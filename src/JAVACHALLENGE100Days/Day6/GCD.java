package JAVACHALLENGE100Days.Day6;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int max = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter your second number : ");
        int secondNumber = input.nextInt();
        int minimumNumber = min(firstNumber , secondNumber);
        for (int i = 1; i < minimumNumber; i++) {
            if(firstNumber%i==0 && secondNumber%i==0){
                max = i;
            }
        }
        System.out.println(max);

    }
    public static int min(int num1 , int num2){
        if(num1< num2){
            return num1;
        }
        return num2;
    }
}
