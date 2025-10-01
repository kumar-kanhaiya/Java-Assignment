package KunalKushwahaAssignment.Strings.Easy;

public class Problem58 {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {
        int ans = 0;

        String result = s.trim();
        if(result.length() <= 1){
            return 1;
        }
        for (int i = result.length()-1; i >= 0 ; i--) {
            char ch = result.charAt(i);
            if(ch == ' '){
                break;
            }
            else{
                ans++;
            }

        }
        return ans;
    }
}
