package KunalKushwahaAssignment.Strings.Easy;

public class Problem1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(i+2 < s.length() && s.charAt(i+2) == '#'){
                String ch = s.substring(i,i+2);
                int index = Integer.parseInt(ch);
                ans += (char)(index + 96);
                i+=2;
            }
            else{
                int index = s.charAt(i) - '0';
                ans += (char)(index + 96);
            }
        }
        return ans;
    }
}
