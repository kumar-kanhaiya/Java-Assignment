package JAVACHALLENGE100Days.Day8;

public class Problem_3 {
    public static void main(String[] args) {
        // repeated word in String

    }
    public static void repeated(String input){
        input = input.toLowerCase();
        for (int i = 0; i <input.length() ; i++) {
            char index = input.charAt(i);
            for (int j = i+1; j < input.length() ; j++) {
                if(index == input.charAt(j)){
                    System.out.print(index);
                }
            }
        }
    }
}
