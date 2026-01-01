package KunalKushwahaAssignment.Strings.Medium;

public class Problem848 {
    public static void main() {
        System.out.println();
        String s = "aaa";
        int[] arr = {1,2,3};
        System.out.println(shiftingLetters(s,arr));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        String ans = "";
        int sum = 0;
        for (int i = shifts.length -1 ; i >=0 ; i--) {
            sum += shifts[i];
//            char demo = (char)(s.charAt(i) + sum ) - 'a';
            int newSymbol = (s.charAt(i) - 'a' + sum) % 26;
            char finalSymbol  = (char)(97+newSymbol);
            ans = finalSymbol + ans;
        }

        return ans ;
    }
}
