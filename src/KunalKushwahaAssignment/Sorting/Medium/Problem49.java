package KunalKushwahaAssignment.Sorting.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem49 {
    public static void main(String[] args) {
        String check = "tea";
        System.out.println(sorted(check));

    }

    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        return ans;
    }

    public static String sorted(String str){
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
