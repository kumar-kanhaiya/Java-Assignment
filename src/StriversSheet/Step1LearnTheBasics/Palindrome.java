package StriversSheet.Step1LearnTheBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        System.out.println(isPalindrome(number));

    }
    public static boolean isPalindrome(int number){
        int real = number;
        int reverse = 0;
        while(number != 0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number /=10;
        }
        if(real == reverse){
            return true;
        }
        return false;
    }

}
