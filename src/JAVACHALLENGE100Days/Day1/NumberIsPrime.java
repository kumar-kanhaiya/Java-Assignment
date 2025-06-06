package JAVACHALLENGE100Days.Day1;

import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = input.nextInt();
        boolean check = true;
        for (int i = 2; i*i <number ; i++) {
            if(number%i == 0){
                check = false;
                break;
            }

        }
        if(check){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime ");
        }
    }
}
