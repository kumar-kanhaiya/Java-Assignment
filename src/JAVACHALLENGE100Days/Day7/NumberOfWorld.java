package JAVACHALLENGE100Days.Day7;

import java.util.Scanner;
// problem

public class NumberOfWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Sentence : ");
        String sentence = input.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char index = sentence.charAt(i);
            if(index == ' ' || i == sentence.length()-1){
                count++;
            }
        }
        System.out.printf("Number of words = %d " , count);
    }
}
