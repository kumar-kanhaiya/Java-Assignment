package KunalKushwahaAssignment.Strings.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1871 {
    public static void main(String[] args) {
        String s = "011010";
        System.out.println(canReach3(s,2,3));

    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        int index = 0;
        while(index< s.length()){
            if(index+minJump < s.length() && index+ maxJump < s.length()
                    && s.charAt(index+minJump) != '0' && s.charAt(index+maxJump) != '0'){
                return false;
            }
            if(index+minJump < s.length() && s.charAt(index + minJump) == '0'){
                index = index+minJump;
            }
            if(index+maxJump < s.length() && s.charAt(index + maxJump) == '0'){
                index = index + maxJump;
            }
        }
        if(index == s.length()-1){
            return true;
        }
        return false;
    }

    // 2nd approach
    public static boolean canReach2(String s , int minJump , int maxJump){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='0'){

                while(!queue.isEmpty() && queue.peek()<i-maxJump){
                    queue.poll();
                }
                if(queue.isEmpty()){
                    return false;
                }
                int prev = queue.peek();
                if(prev+maxJump >= i && prev + minJump <=i){
                    queue.offer(i);
                    if(i ==s.length()-1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //3rd approach
    public static boolean canReach3(String s , int min , int max){
        int n = s.length();
        if(s.charAt(n-1) == '1'){
            return false;
        }

        boolean[] dp = new boolean[n];
        dp[0] = true;

        int reachable = 0;
        for (int i = 1; i < n; i++) {

            if (i - min >= 0) {
                reachable += dp[i - min] ? 1 : 0;
            }

            if (i - max - 1 >= 0) {
                reachable -= dp[i - max - 1] ? 1 : 0;
            }

            dp[i] = (reachable > 0 && s.charAt(i) == '0');
        }

        return dp[n - 1];
    }
}
