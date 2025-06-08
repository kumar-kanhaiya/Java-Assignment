package JAVACHALLENGE100Days.Day3;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your complete word ");
        String name = input.nextLine();
        System.out.println(name.replaceAll(" ", ""));


    }
}
