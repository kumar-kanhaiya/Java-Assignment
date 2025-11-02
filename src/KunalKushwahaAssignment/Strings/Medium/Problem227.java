package KunalKushwahaAssignment.Strings.Medium;

import java.util.HashSet;
import java.util.Stack;

public class Problem227 {
    public static void main(String[] args) {
        String  s = "3+2*2";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<Character> symbol = new Stack<>();
        String check = s.trim();


        int i = 0;
        String sh = "";
        while(i<check.length()){
            if(check.charAt(i) == '+' || check.charAt(i) == '-'
                || check.charAt(i) == '*' || check.charAt(i) =='/'){
                symbol.push(s.charAt(i));
                number.push(Integer.parseInt(sh));
                sh = "";
                i++;
            }

            else{
                sh += check.charAt(i);
                i++;
            }
        }



        // now perform the operation
        int ans = 0;
        while(!number.isEmpty() && !symbol.isEmpty()){
            int first = number.pop();
            char sign = symbol.pop();
            int second = number.pop();

            switch (sign){
                case '+':
                    ans += (first + second);
                    break;

                case '-':
                    ans += (first - second);
                    break;

                case '*':
                    ans += (first*second);
                    break;

                case '/':
                    ans += (first/second);
                    break;
            }
        }

        return ans;

    }
}
