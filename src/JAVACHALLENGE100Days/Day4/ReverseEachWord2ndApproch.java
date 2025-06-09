package JAVACHALLENGE100Days.Day4;

import java.util.Scanner;

public class ReverseEachWord2ndApproch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reverse = " ";
        for (int i = 0; i < sentence.length() ; i++) {
            char copy = sentence.charAt(i);
            if(copy == ' '|| i ==sentence.length() -1);
            for (int j = i; j >= 0  ; j--) {
                reverse = reverse+ sentence.charAt(j) ;
            }
        }
        System.out.println(reverse);
    }
}
