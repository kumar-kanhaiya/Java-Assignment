package KunalKushwahaAssignment.Strings.Easy;

import java.util.Stack;

public class Problem557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));

    }

    // 1st approach
    public static String reverseWords(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            int j = i;
            while(j< s.length() && s.charAt(j) != ' '){
                stack.add(s.charAt(j));
                j++;
            }
            i=j;
            for (int k = 0; k < stack.size(); k++) {
                ans += stack.pop();
            }
        }
        return ans;
    }
}
