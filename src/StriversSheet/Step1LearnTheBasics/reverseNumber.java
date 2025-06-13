package StriversSheet.Step1LearnTheBasics;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input

    }
    public static int reverse(int number){
        int reverse = 0;
        while(number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number /=10;
        }
        return reverse;
    }
}
