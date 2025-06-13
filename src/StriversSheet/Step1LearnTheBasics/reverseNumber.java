package StriversSheet.Step1LearnTheBasics;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        System.out.println("Number reverse = " + reverse(number));

    }
    public static int reverse(int number){

        int reverse = 0;
        while(number != 0){
            int rem = number%10;
            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE/10){
                return 0;
            }
            reverse = reverse*10 + rem;
            number /=10;
        }
        return reverse;
    }
}
