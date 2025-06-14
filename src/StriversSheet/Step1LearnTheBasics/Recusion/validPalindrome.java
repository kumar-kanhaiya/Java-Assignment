package StriversSheet.Step1LearnTheBasics.Recusion;
// leetcode 125 - vallid palindrome
public class validPalindrome {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(name));

//        System.out.println(isPalindrome(name));

    }
//    public static boolean isPalindrome(String input){
//        StringBuilder sh = removeSpace(input);
//        StringBuilder reverse = reverse(sh);
//        for (int i = 0; i < sh.length(); i++) {
//            char copyFirst = sh.charAt(i);
//            char copySecond = reverse.charAt(i);
//            if(copySecond == copyFirst){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static StringBuilder removeSpace(String input){
//        input = input.toLowerCase();
//        StringBuilder sh = new StringBuilder();
//        for (int i = 0; i < input.length() ; i++) {
//            char ch = input.charAt(i);
//            if(ch == ' ' || ch == ',' || ch==':'){
//                continue;
//            }
//            sh.append(ch);
//        }
//        return sh;
//    }
//    public static StringBuilder reverse(StringBuilder input){
//        StringBuilder rev = new StringBuilder();
//        for (int i = 0; i < input.length() ; i++) {
//            char copy = input.charAt(input.length() - i - 1);
//            rev.append(copy);
//
//        }
//        return rev;
//    }
    public static boolean isPalindrome(String input ){
        String first = removeSpaces(input) ;
        String second = reverse(first);
        for (int i = 0; i <first.length() ; i++) {
            if(first.charAt(i) != second.charAt(i)){
                return false;
            }

        }
        return true;
    }

    public static String reverse(String input){
        String rev = " ";
        for (int i = 0; i < input.length(); i++) {
            rev = input.charAt(i) + rev ;

        }
        return rev;
    }
    public static String removeSpaces(String input){
        input  = input.toLowerCase();
        String rev = "";
        for (int i = 0; i < input.length() ; i++) {
            int index = (int) input.charAt(i);
            if(index <97 || index > 122){
                continue;
            }
            rev = rev + input.charAt(i);

        }
        return rev;
    }
}
