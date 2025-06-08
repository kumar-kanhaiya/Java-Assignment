package JAVACHALLENGE100Days.Day3;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        int check = 0;
        int real = number;
        while(number>0){
            int rem = number%10;
            check += Math.pow(rem,3);
            number /=10 ;
        }
        if(real == check){
            System.out.println("Number is Palindrome ");
        }
        else{
            System.out.println("Number is not Palindrome ");
        }
    }

}
