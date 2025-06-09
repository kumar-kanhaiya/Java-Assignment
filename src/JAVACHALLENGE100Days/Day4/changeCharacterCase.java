package JAVACHALLENGE100Days.Day4;

import java.util.Scanner;

public class changeCharacterCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your character : ");
        String sentence = input.next();
        char first = sentence.charAt(0);
        System.out.print("Smaller case : "+ first);
        char ans = (char)(first - 32);
        System.out.println("Capital Case : " + ans);
    }
}
