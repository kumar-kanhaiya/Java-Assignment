package JAVACHALLENGE100Days.Day7;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Sentence : ");
        String word = input.next();
        System.out.println(NonRepeat(word));

    }

    public static char NonRepeat(String word) {
        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char index = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (index == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                return index;
            }

        }
        return ' ';
    }
}
