package KunalKushwahaAssignment.Strings.Medium;

import java.util.ArrayList;
import java.util.List;

public class Problem1513 {
    public static void main(String[] args) {
        String s = "111111";
    //        System.out.println(count1Continue(s));
        System.out.println(numSub(s));

    }

    // normal approach without optimization
    public static int numSub(String s) {
        int end = count1Continue(s);
        int i = 1;
        int ans = 0;
        while(i<= end){
            ans += subStringFind(s,i);
            i++;
        }
        return ans;
    }

    public static int count1Continue(String s){
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < s.length() ; i++) {
            int count = 0;
            if(s.charAt(i) == '1'){
                currentCount++;
                maxCount = Math.max(currentCount,maxCount);

            }
            else{
                currentCount = 0;
            }

        }
        return maxCount;
    }

    public static int subStringFind(String s , int n){
//        List<Integer> data = convert(s,n);
        int count = 0;
        for (int i = 0; i <= s.length() - n; i++) {
            boolean valid = true;
            for (int j = i; j < i + n; j++) {
                if (s.charAt(j) != '1') {
                    valid = false;
                    break;
                }
            }
            if (valid) count++;
        }

        return count;

    }

//    static List<Integer> convert(String s, int groupSize) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < s.length(); i += groupSize) {
//            int end = Math.min(i + groupSize, s.length());
//            String sub = s.substring(i, end);
//            list.add(Integer.parseInt(sub));
//        }
//        return list;
//    }

}
