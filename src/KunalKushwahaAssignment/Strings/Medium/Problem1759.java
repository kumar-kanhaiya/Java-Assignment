package KunalKushwahaAssignment.Strings.Medium;

import java.util.stream.Collectors;

public class Problem1759 {
    public static void main(String[] args) {
        String s = "zzzzz";
        System.out.println(countHomogenous1(s));

    }

    public static int countHomogenous(String s) {
        int ans = 0;
        int mod = 1000000007;
        // if all the element is same then we use n * (n+1)/2 formula

        if(s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet()).size() == 1){
            int length = s.length();

            ans = (length * (length + 1 ))/2;
            return ans;
        }

        for (int i = 0; i < s.length() ; i++) {
            String check = s.charAt(i)+"";
            for(int j = i ; j< s.length() ; j++){
                if(s.charAt(i) != s.charAt(j)){
                    break;
                }
                check += s.charAt(j);
            }
            ans += check.length();
        }

        return ans;
    }

    //2nd approach
    public static int countHomogenous1(String s){
        long mod = 1000000007;

        long ans = 0;
        for (int i = 0; i <s.length() ;) {
            long count =0;
            char ch = s.charAt(i);

            while(i<s.length() && s.charAt(i) == ch){
                count++;
                i++;
            }
            ans += ((count * (count +1))/2)%mod;
        }
        return (int)(ans %mod);
    }

}
