package JAVACHALLENGE100Days.Day5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Enter your year ");
        year = input.nextInt();
        if(year%4==0 && year%100 != 0 || year%400 == 0){
            System.out.println(year + " is a leap year ");
        }
        else{
            System.out.println(year + " is not a leap year ");
        }
    }
}
