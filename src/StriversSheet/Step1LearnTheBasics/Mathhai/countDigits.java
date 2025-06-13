package StriversSheet.Step1LearnTheBasics.Mathhai;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int count = 0 ;
        while(number>0){
//            int rem = number%10;
            count++;
            number /=10;
        }
        System.out.println(count);
    }
}
