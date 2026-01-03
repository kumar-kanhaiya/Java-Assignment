package KunalKushwahaAssignment.Strings.Medium;

public class Problem848 {
    public static void main() {
        System.out.println();
        String s = "mkgfzkkuxownxvfvxasy";
        int[] arr = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,
                137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        System.out.println(shiftingLetters(s,arr));
        String demo = "abc";
        int[] check = {3,5,9};
        System.out.println(shiftingLetters(demo,check));
    }

    public static String shiftingLetters1(String s, int[] shifts) {
        String ans = "";
        long sum = 0;
        for (int i = shifts.length -1 ; i >=0 ; i--) {
            sum += shifts[i];
//            char demo = (char)(s.charAt(i) + sum ) - 'a';
            int newSymbol = (int)((s.charAt(i) - 'a' + sum) % 26);
            char finalSymbol  = (char)(97+newSymbol);
            ans = finalSymbol + ans;
        }

        return ans ;
    }

    // 2nd optimised answer
    public static String shiftingLetters(String s , int[] shifts){
        char[] ch = s.toCharArray();
        int sum = 0;
        int n = s.length();
        for (int i = n-1; i >= 0 ; i--) {
            sum += shifts[i] %26;
            ch[i] = (char)('a' + (ch[i] - 'a' + sum)%26);
        }

        return new String(ch);
    }
}
