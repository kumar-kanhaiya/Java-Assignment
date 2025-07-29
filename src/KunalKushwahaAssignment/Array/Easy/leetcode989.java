package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode989 {
    public static void main(String[] args) {
        int[] array = {1,2,0,0};
        System.out.println(array.length);
        System.out.println(addToArrayForm(array , 34));


    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int reverse = 0;
        while (i< num.length){
            reverse = reverse*10 + num[i]  ;
            i++;
        }
        int all = reverse+k;
        String str = String.valueOf(all);
        for (char ch : str.toCharArray()) {
            list.add(ch - '0');
        }
        return list;
    }

    // second approach


}
