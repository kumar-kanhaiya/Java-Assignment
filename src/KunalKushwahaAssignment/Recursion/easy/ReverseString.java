package KunalKushwahaAssignment.Recursion.easy;

import java.util.Arrays;

public class ReverseString {
    static void main() {
        char[] ch = {'p','o','q'};
        reverseString(ch);
        System.out.println(Arrays.toString(ch));


    }

    public static void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }

    public static void helper(char[] s , int start , int end){
        // base condition
        if(start == end || start> end ){
            return;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end]= temp;

        helper(s,start+1 , end- 1);
    }
}
