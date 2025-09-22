package KunalKushwahaAssignment.Sorting.Medium;

import java.util.*;

public class Problem49 {
    public static void main(String[] args) {
        String check = "tea";
        System.out.println(sorted(check));
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String key = sorted(s);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static String sorted(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static String sorted2(String str){
        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int) str.charAt(i);
        }
        Arrays.sort(arr);
        String ans = "";
        for (int i = 0; i < arr.length ; i++) {
            ans += (char) arr[i];
        }
        return ans;
    }
}
