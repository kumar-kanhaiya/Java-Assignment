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
            if(ch== ' ' || i== s.length() - 1){
                while(!stack.isEmpty()){
                    if(stack.peek() == ' '){

                        String demo = "" +stack.pop();
                        continue;
                    }

                    ans = ans + stack.pop();
                }
                if(i != s.length() -1) {
                    ans += " ";
                }
            }
        }
        return ans;
    }


    public String reverseWords2(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse());
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
