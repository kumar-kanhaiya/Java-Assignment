package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1431 {
    // correct with 85.59% beats
    public static void main(String[] args) {
        int[] array = {2,3,5,1,3};
        List<Boolean> ans = kidsWithCandies(array , 3);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(ans.get(i));
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i] + extraCandies >= maximum(candies)){
                ans.add(true);

        }
            else {
                ans.add(false);
            }
     }
        return ans;
    }
    public static int maximum(int[] array ){
        int max = 0 ;
        for(int element : array ){
            if(element > max){
                max = element;
            }
        }
        return max;
    }
}
