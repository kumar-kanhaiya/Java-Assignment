package KunalKushwahaAssignment.Strings.Easy;

public class Problem1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","b","c"};
        System.out.println(numOfStrings(patterns,"aaaaabbbbb"));

    }

    public static int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (int i = 0; i < patterns.length; i++) {
            if(word.contains(patterns[i])){
                ans++;
            }
        }
        return ans;
    }
}
