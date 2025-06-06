package JAVACHALLENGE100Days.Day1;

public class ReversAString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        String reverse = " ";
        for (int i = 0; i <str.length() ; i++) {
            char copy = str.charAt(i);
            reverse = copy + reverse;
        }
        System.out.println(reverse);
    }
}
