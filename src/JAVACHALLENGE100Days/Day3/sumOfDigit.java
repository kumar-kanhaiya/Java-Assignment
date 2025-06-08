package JAVACHALLENGE100Days.Day3;

import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        while(number >0){
            int rem = number%10;
            sum += rem;
            number /=10;
        }
        System.out.printf("The sum of the digit of the number is : %d" , sum);
    }

}
