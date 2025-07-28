package KunalKushwahaAssignment.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1431 {
    public static void main(String[] args) {
        int[] array = {2,3,5,1,3};
        System.out.println(kidsWithCandies(array,3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = max(candies);
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies < max){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
    public static int max(int[] array ){
        int maxx = 0 ;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > maxx){
                maxx = array[i];
            }
        }
        return maxx;
    }

}
