package KunalKushwahaAssignment.Strings.Easy;

import java.util.HashSet;
import java.util.Set;

public class Problem1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1.length != word2.length){
            return false;
        }
        Set<String> set = new HashSet<>();

        Set<String> set1 = new HashSet<>();
        for(String word : word1){
            set.add(word);
        }
        for(String word : word2){
            set1.add(word);
        }
        for(String word : set){
            if(!set1.contains(word)){
                return false;
            }
        }

        return true;
    }
}
