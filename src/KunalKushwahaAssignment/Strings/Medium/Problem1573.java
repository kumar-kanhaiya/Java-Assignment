package KunalKushwahaAssignment.Strings.Medium;

public class Problem1573 {
    public static void main(String[] args) {
        String s = "10101";
        System.out.println(numWays(s));

    }

    public static int numWays(String s) {
        long totalOnes = repeatingOne(s);
        long Mod = 1_000_000_007;
        long n = s.length();

        if(totalOnes == 0){
            return (int) (((n-1)*(n-2))/2 % Mod);
        }
        if(totalOnes%3 != 0){
            return 0;
        }
        long oneThird = totalOnes/3;
        totalOnes = 0;
        long ways1 =0;
        long ways2 = 0;
        for(char c : s.toCharArray()){
            totalOnes += c -'0';
            if(totalOnes == oneThird){
                ways1++;
            }
            if(totalOnes == 2*oneThird){
                ways2++;
            }
        }
        return (int) ((ways1 * ways2) %Mod);


    }
    public static long repeatingOne(String s){
        long ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}
