package StriversSheet.Step1LearnTheBasics;

import java.util.Scanner;

public class checkForPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        System.out.println(isPrime(number));
    }
    public static boolean isPrime(int number ){
        for (int i = 2; i*i < number ; i++) {
            if(number %i == 0){
                return false;
            }

        }
        return true;
    }
}
