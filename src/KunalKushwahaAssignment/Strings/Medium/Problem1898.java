package KunalKushwahaAssignment.Strings.Medium;

import java.util.ArrayList;

public class Problem1898 {
    public static void main(String[] args) {
        String s = "abcbddddd";
        String p = "abcd";
        int[] removal = {3,2,1,4,5,6};
        System.out.println(maximumRemovals(s,p,removal));

    }


    public static int maximumRemovals(String s, String p, int[] removable) {
        int ans = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s.toCharArray());
        for (int i = 0; i < removable.length; i++) {
            stringBuilder.deleteCharAt(removable[i]);
            s = stringBuilder.toString();
            ArrayList<Character> check = convertList(s);
            for (int j = 0; j < p.length(); j++) {
                if(!check.contains(p.charAt(j))){
                    return ans;
                }
            }


            ans++;
        }
        return ans;
    }
    public static ArrayList<Character> convertList(String s ){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            list.add(s.charAt(i));
        }
        return list;
    }
}
