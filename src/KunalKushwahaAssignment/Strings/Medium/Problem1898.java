package KunalKushwahaAssignment.Strings.Medium;

import java.util.ArrayList;

public class Problem1898 {
    public static void main(String[] args) {
        String s = "abcab";
        String p = "abc";
        int[] removal = {0,1,2,3,4};
        System.out.println(maximumRemovals2(s,p,removal));

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
    
    //2nd approach

    //by using binary search for optimization
    public static int maximumRemovals2(String s , String p , int[] removable){
        int ans = 0;

//        for (int i = 0; i < removable.length ; i++) {
//            check[removable[i]] = true;
//            if(!isSubsequence(s , p ,check)){
//                return ans;
//            }
//            ans++;
//        }
//        return ans;
        int start = 0;
        int end = removable.length-1;
        while(start<= end){
            int mid = (start + end)/2;
            boolean[] check = new boolean[s.length()];
            for (int i = 0 ; i<= mid ; i++){
                 check[removable[i]] = true;
            }

            if(!isSubsequence(s,p,check)){
                end = mid - 1;
            }
            else{
                ans = mid+1;

                start = mid +1;


            }


        }
        return ans;
    }

    public static boolean isSubsequence(String s , String p , boolean[] check){
        int i = 0;
        int j = 0;
        while(i<s.length() && j < p.length()){
            if(!check[i] && s.charAt(i) == p.charAt(j)){
                j++;
            }
            i++;
        }
        return j == p.length();
    }
}
