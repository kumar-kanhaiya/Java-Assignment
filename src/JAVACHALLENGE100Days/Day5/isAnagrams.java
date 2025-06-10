package JAVACHALLENGE100Days.Day5;

import java.util.Scanner;

public class isAnagrams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String character1 , character2 ;
        System.out.print("Enter your first character : ");
        character1 = input.next();
        System.out.print("Enter your second character : ");
        character2 = input.next();
        boolean isExist = true;
        for (int i = 0; i <character1.length() ; i++) {
            char copy = character1.charAt(i);
            for (int j = 0; j <character2.length() ; j++) {
                if(copy != character2.charAt(j)){
                    isExist = false;
                }
                else{
                    isExist = true;
                    break;
                }
            }
        }
        if(isExist){
            System.out.println("anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }
    }
}
