package StriversSheet.Step1LearnTheBasics.Mathhai;

import java.util.Scanner;

public class isArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        System.out.println(isArmstrong(number));
    }
    public static boolean isArmstrong(int number ){
        int real = number;
        int check = 0;
        while(number != 0){
            int rem = number %10;
            check += Math.pow(rem,3);
            number /= 10;
        }
        if(real == check){
            return true;
        }
        return false;
    }
}
