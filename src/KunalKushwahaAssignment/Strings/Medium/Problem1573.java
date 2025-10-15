package KunalKushwahaAssignment.Strings.Medium;

public class Problem1573 {
    public static void main(String[] args) {
        String s = "10101";

    }

    public static int numWays(String s) {
        int totalOnes = repeatingOne(s);
        if(totalOnes%3 != 0){
            return 0;
        }

    }
    public static int repeatingOne(String s){
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
