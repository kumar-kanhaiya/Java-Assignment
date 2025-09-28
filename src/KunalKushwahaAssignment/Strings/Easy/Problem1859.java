package KunalKushwahaAssignment.Strings.Easy;

public class Problem1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        int in = 0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) == ' '){
                int index = (int) s.charAt(i-1);
                String ans = "";
                for (int j = in; j < i-1; j++) {
                    ans += s.charAt(j);
                }
                array[in] = ans;
                in = i;
            }
        }
        String ans = "";
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
            if(i< array.length-1){
                ans += " ";
            }
        }
        return ans;

    }
    public static int countSpace(String s){
        int ans =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                ans++;
            }
        }
        return ans;
    }
}
