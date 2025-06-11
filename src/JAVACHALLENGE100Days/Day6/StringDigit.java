package JAVACHALLENGE100Days.Day6;

import java.util.Scanner;

public class StringDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String character = input.next();
        boolean isExist = true;
        for (int i = 0; i < character.length() ; i++) {
            int index = character.charAt(i);
            if(index>=65 && index<=90 || index>97 && index<=122){
                isExist = false;
                break;
            }
        }
        if(isExist){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
