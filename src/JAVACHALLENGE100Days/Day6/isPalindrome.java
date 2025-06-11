package JAVACHALLENGE100Days.Day6;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int real = number;
        int reverse = 0;
        while(number>0){
            int rem = number%10;
            reverse = reverse*10 + rem;
            number /=10;
        }
        if(real == reverse){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome ");
        }
    }
}
