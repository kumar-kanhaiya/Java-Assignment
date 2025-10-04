package KunalKushwahaAssignment.Strings.Easy;

import java.util.Arrays;

public class Problem1668 {
    public static void main(String[] args) {
        String s = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        System.out.println(maxRepeating2(s,"aaaba"));


    }

    public static int maxRepeating(String sequence, String word) {
        int ans = 0;
        for (int i = 0; i < sequence.length(); i++) {
            StringBuilder builder = new StringBuilder();

//            builder.append(sequence.charAt(i));
            int j = 0;
            while(j< word.length() && j+i < sequence.length()){
                builder.append(sequence.charAt(j+i));
                j++;
            }
            if(builder.toString().equals(word)){
                ans++;
            }
        }
        return ans;
    }

    // 2nd approach
    public static int maxRepeating2(String sequence, String word) {
        int count = 0;
        String temp = word;

        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }
        return count;
    }
}
