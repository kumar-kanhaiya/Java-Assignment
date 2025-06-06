package JAVACHALLENGE100Days.Day1;

import java.util.Scanner;

public class CountVowelInString {
    public static void main(String[] args) {
        String input ;
        System.out.print("Enter your string : ");
        Scanner in = new Scanner(System.in);
        input = in.next();
        int numberOfVowel = 0;
        for (int i = 0; i < input.length() ; i++) {
            char a = input.charAt(i);
            if(a=='a' || a=='i' || a=='o' || a=='u' ||a=='A' || a=='E' || a=='I' || a=='O'
            || a=='U'){
                numberOfVowel++;
            }

        }
        System.out.println("Number of vowel in String is : " + numberOfVowel);
    }
}
