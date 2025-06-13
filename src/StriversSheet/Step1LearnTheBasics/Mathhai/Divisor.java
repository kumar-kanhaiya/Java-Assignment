package StriversSheet.Step1LearnTheBasics.Mathhai;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter your number : ");
        number = input.nextInt();
        for (int i = 1; i <= number ; i++) {
            if(number%i == 0){
                System.out.printf("%d , ",i);
            }
        }
    }
}
