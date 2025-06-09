package JAVACHALLENGE100Days.Day4;

import java.util.Scanner;
import java.util.*;

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String sentence = input.nextLine();
        String reverse = " ";
        Stack<Character> s1=new Stack<>();

        for (int i = 0; i <sentence.length() ; i++) {
            char ch = sentence.charAt(i);
            s1.push(ch);
            if(ch==' '|| i== sentence.length()-1 ){
                while(!s1.isEmpty()){
                    reverse=reverse+s1.pop();
                }
                reverse=reverse+" ";
            }
//            reverse = ch + reverse;
        }
        System.out.println("Reverse word : " + reverse);
    }
}
