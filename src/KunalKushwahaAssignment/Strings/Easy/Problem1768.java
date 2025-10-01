package KunalKushwahaAssignment.Strings.Easy;

public class Problem1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1,word2));

    }

    public static String mergeAlternately(String word1, String word2) {
        int index = 0;
        StringBuilder ans = new StringBuilder();
        while(index< word1.length() && index< word2.length()){
            ans.append(word1.charAt(index));
            ans.append(word2.charAt(index));
            index++;
        }

        while(index<word1.length()){
            ans.append(word1.charAt(index));
            index++;
        }

        while(index<word2.length()){
            ans.append(word2.charAt(index));
            index++;
        }

        return ans.toString();
    }
}
