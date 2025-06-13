package StriversSheet.Step1LearnTheBasics.Mathhai;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
//        System.out.print("Enter your number : ");
//        number = input.nextInt();
        System.out.println(GCD(12,30));
    }
    public static int  GCD(int num1 , int num2){
        int minimum = minimum(num1 , num2);
        int max = 1;
        for (int i = 2; i <= minimum ; i++) {
            if(num1%i == 0 && num2%i ==0){
                max = i;
            }
        }
        return max;
    }
    public static int minimum(int num1 , int num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }
}
