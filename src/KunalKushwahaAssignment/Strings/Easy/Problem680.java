package KunalKushwahaAssignment.Strings.Easy;

public class Problem680 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));

    }

    public static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            if(s.charAt(start) != s.charAt(end)){
                end--;
                if(start != end){
                    return false;
                }
            }
        }

        return true;
    }


}
