package JAVACHALLENGE100Days.Day8;

import java.util.Scanner;

public class ReverseUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int reverse = 0;
        while(number !=0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number /=10;
        }
        System.out.println(reverse);
    }
}
