package KunalKushwahaAssignment.Strings.Easy;

public class Problem1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for(String word : words){
            int index = word.charAt(word.length() - 1) -'0';
            String mainWord = word.substring(0, word.length() - 1);
            sorted[index - 1] = mainWord;
        }
        return String.join(" ",sorted);

    }
//    public static int countSpace(String s){
//        int ans =0;
//        for (int i = 0; i < s.length(); i++) {
//            if(s.charAt(i) == ' '){
//                ans++;
//            }
//        }
//        return ans;
//    }
}
