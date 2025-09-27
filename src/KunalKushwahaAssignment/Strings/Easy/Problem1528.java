package KunalKushwahaAssignment.Strings.Easy;

import java.util.*;

public class Problem1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indicies = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indicies));

    }

    public static String restoreString2(String s, int[] indices) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < indices.length ; i++) {
            stringBuilder.append(s.charAt(indices[i]));
        }
        return stringBuilder.toString();
    }

    public static String restoreString(String s , int[] indices){
        Map<Integer , Character> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i] , s.charAt(i));
        }
        ArrayList<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);

        String ans = "";
        for(int element : sortedKeys){
            ans += map.get(element);
        }
        return ans;
    }
    public String restoreString3(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
    }

}
