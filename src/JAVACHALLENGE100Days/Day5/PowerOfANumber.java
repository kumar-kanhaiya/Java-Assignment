package JAVACHALLENGE100Days.Day5;

import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        System.out.print("Enter the power : ");
        int exponent = input.nextInt();
        System.out.println(Solution(number,exponent));


        System.out.println("the ans : " + number);
    }
    public static int Solution(int number , int power){
        if(power ==  0){
            return 1;
        }
        return number*Solution(number , power-1);
    }
}
