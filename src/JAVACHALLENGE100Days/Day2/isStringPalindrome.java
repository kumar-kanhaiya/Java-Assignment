package JAVACHALLENGE100Days.Day2;

import java.util.Scanner;

public class isStringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String name = input.next();
        String reverse = "";
        for (int i = 0; i < name.length() ; i++) {
            reverse = reverse + name.charAt(i);
        }
        if(name.equals(reverse)){
            System.out.println("String is palindrome ");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
