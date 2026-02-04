package A2Z_DSA_Sheet.LearnBasic;

import java.util.ArrayList;

public class BasicMath {
    static void main() {
        System.out.println(countDigit(4));
        System.out.println(reverse(-120));
        System.out.println(isPalindrome(124));
        System.out.println(isArmstrong(154));

    }
    public static int countDigit(int n){
        int count = 0;
        while(n>=1 ){
            int temp = n%10;
            count++;
            n /= 10;
        }
        return  count;
    }
    // leetcode medium
    public static int reverse(int x) {
        boolean check = true;
        if(x<0){
            check = false;
            x = -x;
        }
        int ans = 0;
        int rev = 0;
        while(x>= 1){
            int temp = x%10;
            rev = rev*10 + temp;
            x /= 10;
        }
        return check? rev : -rev;
    }

    // palindrome number
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev =0;
        while(n !=0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev==temp;
    }

    // armStrong Number
    public static boolean isArmstrong(int n) {
        int temp = n;
        int check = 0;
        while(n != 0){
            int rem = n%10;
            check = check + (int) Math.pow(rem,3);
            n /= 10;
        }
        return check == temp;
    }

    // divisor of a number
    // first approach
    public static ArrayList<Integer> divisors1(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                ans.add(i);
            }
        }
        return ans;
    }

    // second approach best
    public static ArrayList<Integer> divisors2(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                ans.add(i);
                if(i != n/i){
                    ans.add(n/i);
                }
            }
        }

        return ans;
    }

    // best Optimal approach
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i*i <= n ; i++) {
            if(n%i == 0){
                count++;
                if(n/i != i){
                    count++;
                }
            }

        }
        return count==2;
    }
}
